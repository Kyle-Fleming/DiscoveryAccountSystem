package za.ac.nwu.ac.domain.service;

import java.io.Serializable;
import java.util.Objects;
/*
to do: for all accountMile management services, change parameters to add value,
subtract value and view value of Account passed through constructor
*/

public class AccountMileAdd<T> implements Serializable{
    private final boolean successful;
    private final transient T payload;

    public AccountMileAdd(boolean successful, T payload) {
        super();
        this.successful = successful;
        this.payload = payload;
    }


    public boolean isSuccessful() {
        return successful;
    }

    public T getPayload() {
        return payload;
    }

    public AccountMileAdd() {

        successful = false;
        payload = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountMileAdd<?> that = (AccountMileAdd<?>) o;
        return successful == that.successful && Objects.equals(payload, that.payload);
    }

    @Override
    public String toString() {
        return "AccountMileAdd{" +
                "successful=" + successful +
                ", payload=" + payload +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(successful, payload);
    }
}
