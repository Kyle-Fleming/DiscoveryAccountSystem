package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

    //TODO: create queries for database to fetch account types and add new ones

    @Query(value ="SELECT"+
    "           at"+
    "           FROM"+
    "           AccountType at"+
    "   WHERE at.mnemonic = :mnemonic")
    AccountType getAccountTypeByMnemonic(String mnemonic);

    @Query(value = "INSERT INTO ACCOUNT_TYPE AT VALUES(ACCOUNT_TYPE_NAME, MNEMONIC, CREATION_DATE")
    AccountTypeDto create(AccountTypeDto accountTypeDto);

    @Query(value = "SELECT DISTINCT ACCOUNT_TYPE_NAME FROM ACCOUNT_TYPE")
    AccountType getAllAccountTypes();
}
