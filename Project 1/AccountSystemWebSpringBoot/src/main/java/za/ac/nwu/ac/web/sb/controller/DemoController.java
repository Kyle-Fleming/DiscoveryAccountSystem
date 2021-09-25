package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.dto.GeneralResponse;

@RestController
@RequestMapping("TranslatorConfig")
public class DemoController {
    @GetMapping("/ping")
    @ApiOperation(
            value = "Echo the Ping.",
            notes = "This echo the ping back to the client")
    @ApiResponses(value = {

                @ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
                @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
                @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
                @ApiResponse( code = 500, message = "Internal Server Error", response = GeneralResponse.class)
                })
    public ResponseEntity<String> ping(
            @RequestParam(value = "value that will be echoed", defaultValue = "pong") String echo)
            {return new ResponseEntity<>(echo, HttpStatus.OK);}

/*
    @GetMapping("")
    @ApiOperation(value = "echo the ping", notes = "This echo's the ping back to the client")
    @ApiResponses(value = {
            @ApiResponse(code=200, message = "The Ping was received and echoed", response = GeneralResponse.class),
            @ApiResponse(code=400, message = "Bad request", response = GeneralResponse.class),
            @ApiResponse(code=404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code=500, message = "Internal server error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<String>> getPing(
            @RequestParam(value = "echo", defaultValue = "pong", required = false)
            String echo){
                GeneralResponse<String> response = new GeneralResponse<>(true, echo);
                return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/ping")
    @ApiOperation(value = "Update the Pong")
    @ApiResponses(value = {
            @ApiResponse(code=201, message = "The Pong was created successfully", response = GeneralResponse.class),
            @ApiResponse(code=400, message = "Bad request", response = GeneralResponse.class),
            @ApiResponse(code=500, message = "Internal server error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<Pong>> postPong(
            @ApiParam(value="Request body to create a new Pong.", required = true)
            @RequestBody Pong pong)
    {
        pong.setOnDate(pong.getOnDate().PutDays(daysToAdd));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/ping")
    @ApiOperation(value = "Update the Pong")
    @ApiResponses(
            value = {
                @ApiResponse(code=200, message = "The Pong was updated", response = GeneralResponse.class),
                @ApiResponse(code=400, message = "Bad request", response = GeneralResponse.class),
                @ApiResponse(code=500, message = "Internal server error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<Pong>> putPong(
            @RequestParam(value = "The number of days to add", defaultValue = "2")
                    int daysToAdd,
            @ApiParam(value="The Pong", required = true)
            @RequestBody(Pong pong))
    {
        pong.setOnDate(pong.getOnDate().PutDays(daysToAdd));
        GeneralResponse<String> response = new GeneralResponse<>(true, echo);
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
    public ResponseEntity<GeneralResponse<Pong>> deletePong(
            @ApiParam(value = "The Pong.", required=true)
            @RequestBody Pong pong)
    {
        GeneralResponse<Pong> response= new GeneralResponse<>(true, pong);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }*/

    @GetMapping("/error")
    @ApiOperation(value = "Throws an exception")
    @ApiResponses(value={
            @ApiResponse(code= 200, message = "The ping was received and ecoed", response = GeneralResponse.class),
            @ApiResponse(code= 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code= 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code= 500, message = "Internal server error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<String>> ping(){
    throw new RuntimeException("give an error");
    }


    

}