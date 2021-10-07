package za.ac.nwu.ac.domain.exception;
import java.io.Serializable;
import java.util.Objects;

public class ErrorResponse <T> implements  Serializable{

    private final boolean successful;
    private final transient T payload;
    private String message;

    public ErrorResponse( String message, boolean successful, T payload) {
        this.successful = successful;
        this.payload = payload;
        this.message = message;
    }


    public boolean isSuccessful() {
        return successful;
    }

    public T getPayload() {
        return payload;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorResponse<?> that = (ErrorResponse<?>) o;
        return successful == that.successful && Objects.equals(payload, that.payload) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successful, payload, message);
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "successful=" + successful +
                ", payload=" + payload +
                ", message='" + message + '\'' +
                '}';
    }
}
