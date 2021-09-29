package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.util.ArrayList;
import java.util.List;

public interface AccountTypeTranslator {

    default List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();

        return accountTypeDtos;
    }

    default AccountTypeDto create(AccountTypeDto accountType) {
        return accountType;
    }

    default AccountTypeDto getAccountTypeByMnemonic(String mnemonic){
        AccountTypeDto accountTypeDto = null;
        return accountTypeDto;
    }


}
