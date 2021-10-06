package za.ac.nwu.ac.web.sb.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.service.GeneralResponse;

@RestController
@RequestMapping("account-transaction")
public class AccountTransactionController {
    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<String>> getAll() {
        GeneralResponse<String> response = new GeneralResponse<>(true, "No types found");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/ping")
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<String>> PostTransaction() {
        GeneralResponse<String> response = new GeneralResponse<>(true, "No types found");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/ping")
    @ApiOperation(value = "Update the Pong")
    @ApiResponses(
            value = {
                    @ApiResponse(code=200, message = "The Pong was deleted", response = GeneralResponse.class),
                    @ApiResponse(code=400, message = "Bad request", response = GeneralResponse.class),
                    @ApiResponse(code=500, message = "Internal server error", response = GeneralResponse.class)
            })
    public ResponseEntity<GeneralResponse<AccountTransaction>> deletePong(
            @ApiParam(value = "The Pong.", required=true)
            @RequestBody AccountTransaction AT1)
    {
        GeneralResponse<AccountTransaction> response= new GeneralResponse<>(true, AT1);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/error")
    @ApiOperation(value = "Throws an exception")
    @ApiResponses(value={
            @ApiResponse(code= 200, message = "The ping was received and echoed", response = GeneralResponse.class),
            @ApiResponse(code= 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code= 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code= 500, message = "Internal server error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<String>> ping(){
        throw new RuntimeException("give an error");
    }
}
