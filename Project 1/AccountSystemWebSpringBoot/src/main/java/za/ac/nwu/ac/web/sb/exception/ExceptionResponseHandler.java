package za.ac.nwu.ac.web.sb.exception;

import lombok.var;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import za.ac.nwu.ac.domain.dto.ErrorResponse;
import za.ac.nwu.ac.domain.dto.GeneralResponse;

import java.util.concurrent.atomic.AtomicReference;

public class ExceptionResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    private ResponseEntity<Object> handleGeneralException(Exception ex, WebRequest request){
        var errorResponse = new ErrorResponse<>(ex.getMessage());
        var generalResponse = new GeneralResponse<>(false, errorResponse);
        var response = new ResponseEntity<>(generalResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        return handleExceptionInternal(ex, response, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
