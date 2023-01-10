package br.com.deposit.dto;

import br.com.deposit.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record DepositResponseDto(
        Status status,
        String walletId,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy'T'HH:mm:ss")
        LocalDateTime operationDate
) {
}
