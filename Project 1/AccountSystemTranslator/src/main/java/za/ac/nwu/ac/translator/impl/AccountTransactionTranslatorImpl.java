package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.repo.persistence.AccountTransactionRepository;

@Component
public class AccountTransactionTranslatorImpl {

    private final AccountTransactionRepository accountTransactionRepository;

    @Autowired

    public AccountTransactionTranslatorImpl(AccountTransactionRepository accountTransactionRepository) {
        this.accountTransactionRepository = accountTransactionRepository;
    }
    /*
    public List<AccountTransactionDto> getAllTransactions(){
        List<AccountTransactionDto> accountTransactionDtos = new ArrayList<>();
        try {
            for (AccountTransaction accountTransaction : accountTransactionRepository.findAll()){
                accountTransactionDtos.add(new AccountTransactionDto(accountTransaction));
            }
        }
    }*/
}
