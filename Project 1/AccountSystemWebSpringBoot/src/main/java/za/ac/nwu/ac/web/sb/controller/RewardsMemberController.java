package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.persistence.RewardsMember;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.ViewRewardsMemberFlow;

@RestController
@RequestMapping("rewards-member")
public class RewardsMemberController {
    private final ViewRewardsMemberFlow viewRewardsMemberFlow;

    @Autowired
    public RewardsMemberController(ViewRewardsMemberFlow viewRewardsMemberFlow) {
        this.viewRewardsMemberFlow = viewRewardsMemberFlow;
    }

    @GetMapping("/{discoveryId}")
    @ApiOperation(value = "Gets configured Rewards member by Id.", notes = "Returns an object of RewardsMember")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Member returned",    response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request",               response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found",                 response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error",     response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<RewardsMember>> getByDiscoveryId(
            @ApiParam(
                    value = "The ID that uniquely identifies the RewardsMember.",
                    example ="125",
                    name = "discoveryId",
                    required = true)
            @PathVariable("discoveryId") final Number discoveryId)
    {
        RewardsMember rewardsMember = viewRewardsMemberFlow.getRewardsMemberById(discoveryId);
        GeneralResponse<RewardsMember> response = new GeneralResponse<>(true, rewardsMember);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
