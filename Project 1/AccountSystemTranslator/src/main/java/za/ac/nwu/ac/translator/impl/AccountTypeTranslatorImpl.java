package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.repo.persistence.AccountTypeRepository;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTypeTranslatorImpl implements AccountTypeTranslator {

    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository){
        this.accountTypeRepository=accountTypeRepository;
    }

//    TODO: figure out how to fix this method in the translator

    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        try{
            for(AccountType accountType : accountTypeRepository.findAll()){
                //current setup of how to add every account type into a string thing
                //accountTypeDtos.add(new AccountTypeDto(accountType));
                accountTypeDtos.add(new AccountTypeDto(accountType.getMnemonic(), accountType.getAccountTypeName(), accountType.getCreationDate()));
            }
        } catch (Exception e) {
            //TODO: Log
            throw new RuntimeException("Unable to read from the database", e);
        }
        return accountTypeDtos;
    }



    public AccountTypeDto create(AccountTypeDto accountType) {
        return accountType;
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
        return null;
    }
}
