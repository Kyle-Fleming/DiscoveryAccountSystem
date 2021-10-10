package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Number> {
/*
    query examples from oracle sql developer 11g
    UPDATE "KYLE"."ACCOUNT_TYPE" SET ACCOUNT_TYPE_NAME = 'Miles' WHERE ROWID = 'AAAE5eAABAAALC5AAA' AND ORA_ROWSCN = '387301'
    UPDATE "KYLE"."ACCOUNT_TYPE" SET ACCOUNT_TYPE_NAME = 'Points' WHERE ROWID = 'AAAE5eAABAAALC5AAB' AND ORA_ROWSCN = '387301'
    INSERT INTO "KYLE"."ACCOUNT_TYPE" (ACCOUNT_TYPE_ID, MNEMONIC, ACCOUNT_TYPE_NAME, CREATION_DATE) VALUES ('3', 'PLAYS', 'Plays', TO_DATE('2021-10-09 17:12:15', 'YYYY-MM-DD HH24:MI:SS'))
*/

    @Query(value = "select"+
            "   ACCOUNT_CURRENCY_TYPE_ID,"+
            "   ACCOUNT_TYPE_NAME,"+
            "   CREATION_DATE,"+
            "   MNEMONIC"+
            "   FROM"+
            "       KYLE.ACCOUNT_CURRENCY_TYPE"+
            "   WHERE MNEMONIC = :mnemonic", nativeQuery = true)
    //Native queries are not recommended.
    AccountType getAccountTypeByMnemonicNativeQuery(String mnemonic);

    @Query(value ="SELECT"+
    "           at"+
    "           FROM"+
    "           AccountType at"+
    "   WHERE at.mnemonic = :mnemonic")
    AccountType getAccountTypeByMnemonic(String mnemonic);


}
