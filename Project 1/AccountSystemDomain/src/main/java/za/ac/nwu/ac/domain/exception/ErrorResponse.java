package za.ac.nwu.ac.domain.exception;
import java.io.Serializable;

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
