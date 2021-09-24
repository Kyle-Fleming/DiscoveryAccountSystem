package za.ac.nwu.ac.domain.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;

@Component
public class AccountTypeDto<T> implements  Serializable{
    private AccountTransactionDto dto;
    private final boolean successful;
    private final transient T payload;
    private LocalDate CreationDate;

    public AccountTypeDto(AccountTransactionDto dto, boolean successful, T payload, LocalDate creationDate) {
        this.dto = dto;
        this.successful = successful;
        this.payload = payload;
        CreationDate = creationDate;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public LocalDate getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        CreationDate = creationDate;
    }

    public T getPayload() {
        return payload;
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
