package za.ac.nwu.ac.web.sb.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.CreateAccountTransactionFlow;
import za.ac.nwu.ac.logic.flow.FetchAccountTransactionFlow;

import java.util.List;

@RestController
@RequestMapping("account-transaction")
public class AccountTransactionController {

    private final FetchAccountTransactionFlow fetchAccountTransactionFlow;
    private final CreateAccountTransactionFlow createAccountTransactionFlow;

    @Autowired
    public AccountTransactionController(FetchAccountTransactionFlow fetchAccountTransactionFlow,
                                        CreateAccountTransactionFlow createAccountTransactionFlow) {
        this.fetchAccountTransactionFlow = fetchAccountTransactionFlow;
        this.createAccountTransactionFlow=createAccountTransactionFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the transactions.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account transactions returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<List<AccountTransactionDto>>> getAll() {
        List<AccountTransactionDto> accountTransactions = fetchAccountTransactionFlow.getAllAccountTransactions();
        GeneralResponse<List<AccountTransactionDto>> response = new GeneralResponse<>(true, accountTransactions);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("")
    @ApiOperation(value = "Creates a new AccountTransaction", notes = "Creates a new AccountTransaction in the DB")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The AccountTransaction was created successfully", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request",                                     response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error",                           response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<AccountTransactionDto>> create(
            @ApiParam(
                    value = "Request body to create a new AccountType.",
                    required = true)
            @RequestBody
                    AccountTransactionDto accountTransaction)
    {
        try {
            AccountTransactionDto accountTransactionResponse = createAccountTransactionFlow.create(accountTransaction);
            GeneralResponse<AccountTransactionDto> response = new GeneralResponse<>(true, accountTransactionResponse);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException("Could not create new transaction");
        }

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
        try {
            GeneralResponse<String> response = new GeneralResponse<>(true, "Error response!");
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            throw new RuntimeException("give an error");
        }
    }
}
