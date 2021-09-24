package za.ac.nwu.ac.domain.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class AccountTransactionDto<T> implements Serializable {
    @SuppressWarnings("rawtypes")
    private AccountTypeDto dto;
    private final boolean successful;
    private final transient  T payload;

    public AccountTransactionDto(boolean successful, T payload) {
        this.successful = successful;
        this.payload = payload;
    }

    public boolean isSuccessful() {
        return successful;
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
