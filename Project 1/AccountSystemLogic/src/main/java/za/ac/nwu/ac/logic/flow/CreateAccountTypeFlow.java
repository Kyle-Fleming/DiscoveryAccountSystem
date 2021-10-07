package za.ac.nwu.ac.logic.flow;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

@Component
public interface CreateAccountTypeFlow {
    AccountTypeDto create(AccountTypeDto accountType);
}
