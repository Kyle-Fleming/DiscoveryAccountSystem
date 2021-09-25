package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.util.ArrayList;
import java.util.List;

public interface AccountTypeTranslator {

    public default List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();

        return accountTypeDtos;
    }

    public default AccountTypeDto create(AccountTypeDto accountType) {
        return accountType;
    }

    public default AccountType getAccountTypeByMnemonic(String mnemonic){
        AccountType accountTypeDto = null;
        return accountTypeDto;
    }

    public default  AccountTypeDto getAccountTypeDtoByMnemonic

}
