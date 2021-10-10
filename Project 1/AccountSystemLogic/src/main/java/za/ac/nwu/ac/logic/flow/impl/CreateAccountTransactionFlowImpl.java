package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.logic.flow.CreateAccountTransactionFlow;
import za.ac.nwu.ac.translator.impl.AccountTransactionTranslatorImpl;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountTransactionFlowName")
public class CreateAccountTransactionFlowImpl implements CreateAccountTransactionFlow {
    private final AccountTransactionTranslatorImpl accountTransactionTranslator;

    @Autowired
    public CreateAccountTransactionFlowImpl(AccountTransactionTranslatorImpl accountTransactionTranslator) {
        this.accountTransactionTranslator = accountTransactionTranslator;
    }

    @Override
    public AccountTransactionDto create(AccountTransactionDto accountTransaction) {
        if(null==accountTransaction.getTransactionDate())
        {
            accountTransaction.setTransactionDate(LocalDate.now());
        }
        return accountTransactionTranslator.create(accountTransaction);
    }
}
