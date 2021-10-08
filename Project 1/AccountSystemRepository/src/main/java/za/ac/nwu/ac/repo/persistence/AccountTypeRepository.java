package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Number> {
/*
    todo: query examples from oracle sql developer 11g
    UPDATE "KYLE"."ACCOUNT_TYPE" SET ACCOUNT_TYPE_NAME = 'Miles' WHERE ROWID = 'AAAE5eAABAAALC5AAA' AND ORA_ROWSCN = '387301'
    UPDATE "KYLE"."ACCOUNT_TYPE" SET ACCOUNT_TYPE_NAME = 'Points' WHERE ROWID = 'AAAE5eAABAAALC5AAB' AND ORA_ROWSCN = '387301'
    INSERT INTO "KYLE"."ACCOUNT_TYPE" (ACCOUNT_TYPE_ID, MNEMONIC, ACCOUNT_TYPE_NAME, CREATION_DATE) VALUES ('3', 'PLAYS', 'Plays', TO_DATE('2021-10-09 17:12:15', 'YYYY-MM-DD HH24:MI:SS'))
*/

    //TODO: create queries for database to fetch account types and add new ones
    @Query(value ="SELECT"+
    "           at"+
    "           FROM"+
    "           AccountType at"+
    "   WHERE at.mnemonic = :mnemonic")
    AccountType getAccountTypeByMnemonic(String mnemonic);
/*
    @Query(value = "SELECT new za.ac.nwu.ac.domain.dto.AccountTypeDto("+
            " at.mnemonic"+
            " at.accountTypeName"+
            " at.creationDate"+
            " FROM"+
            " AccountType at"+
            " WHERE at.mnemonic =:mnemonic")
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);*/
}
