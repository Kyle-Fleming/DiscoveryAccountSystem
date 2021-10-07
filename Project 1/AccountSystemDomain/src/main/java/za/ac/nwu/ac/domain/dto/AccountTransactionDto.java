package za.ac.nwu.ac.domain.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransactionDto<?> that = (AccountTransactionDto<?>) o;
        return successful == that.successful && Objects.equals(dto, that.dto) && Objects.equals(payload, that.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dto, successful, payload);
    }

    @Override
    public String toString() {
        return "AccountTransactionDto{" +
                "dto=" + dto +
                ", successful=" + successful +
                ", payload=" + payload +
                '}';
    }
}
