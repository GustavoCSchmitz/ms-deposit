package br.com.deposit.api.contract;

import br.com.deposit.api.form.DepositForm;
import br.com.deposit.dto.DepositResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/deposit")
public interface DepositApi {

    @Operation(summary = "Create a new wallet")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Ok", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "412", description = "Precondition failed", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "422", description = "Unprocessable entity", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "500", description = "Service error", content = @Content(mediaType = "application/json"))
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    DepositResponseDto deposit(@RequestBody DepositForm depositForm);
}
