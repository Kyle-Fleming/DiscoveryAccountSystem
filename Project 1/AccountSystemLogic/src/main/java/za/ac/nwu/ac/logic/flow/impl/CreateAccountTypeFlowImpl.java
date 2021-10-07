package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.logic.flow.CreateAccountTypeFlow;

import javax.transaction.Transactional;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {
   /* private final AccountTypeTranslatorImpl accountTypeTranslator;

    @Autowired
    public CreateAccountTypeFlowImpl(AccountTypeTranslatorImpl accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType){
        if(null==accountType.getCreationDate()){
            accountType.setCreationDate(LocalDate.now());
        }
        return accountTypeTranslator.create(accountType);
    }*/
}
