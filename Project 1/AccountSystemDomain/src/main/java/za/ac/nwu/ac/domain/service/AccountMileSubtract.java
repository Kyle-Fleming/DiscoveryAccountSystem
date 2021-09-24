package za.ac.nwu.ac.domain.service;

import java.io.Serializable;
import java.util.Objects;

/* todo: for all accountMile management services, change parameters to add value subtract value and view value of Account passed through constructor */
public class AccountMileSubtract<T> implements Serializable{

    private final boolean successful;
    private final transient T payload;

    public AccountMileSubtract(boolean successful, T payload) {
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
        AccountMileSubtract<?> that = (AccountMileSubtract<?>) o;
        return successful == that.successful && Objects.equals(payload, that.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successful, payload);
    }

    @Override
    public String toString() {
        return "AccountMileSubtract{" +
                "successful=" + successful +
                ", payload=" + payload +
                '}';
    }
}
