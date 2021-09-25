package za.ac.nwu.ac.domain.dto;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;

@Component
public class AccountTypeDto<T> implements  Serializable{
    private final AccountType accountType;
    private AccountTransactionDto dto;

    private LocalDate CreationDate;


    public AccountTypeDto(AccountType accountType){
        this.accountType=accountType;

    }

    public AccountType getAccountType() {
        return accountType;
    }


    public LocalDate getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        CreationDate = creationDate;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
