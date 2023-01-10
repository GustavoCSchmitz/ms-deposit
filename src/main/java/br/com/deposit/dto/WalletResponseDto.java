package br.com.deposit.dto;

import java.math.BigDecimal;

public record WalletResponseDto(
        String id,
        BigDecimal accountBalance
) {
}
