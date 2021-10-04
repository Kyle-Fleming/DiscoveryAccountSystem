package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

    //TODO: create queries for database to fetch account types and add new ones

    @Query(value = "SELECT AT FROM ACCOUNTTYPE WHERE AT.MNEMONIC = :MNEMONIC")
    AccountType getAccountTypeByMnemonic(String mnemonic);

    @Query(value = "INSERT"+" INTO"+" ACCOUNTTYPE "+"AT"+" VALUES("+"AT.ACCOUNTTYPENAME = :ACCOUNTTYPENAME," +
            "AT.MNEMONIC = :MNEMONIC" + "AT.CREATIONDATE = :CREATIONDATE)")
    AccountTypeDto create(AccountTypeDto accountTypeDto);

    @Query(value = "SELECT NEW za.ac.nwu.ac.domain.dto.AccountTypeDto(" + "at.mnemonic, " + "")
    AccountType getAccountTypeDtoByMnemonic(String mnemonic);
}
