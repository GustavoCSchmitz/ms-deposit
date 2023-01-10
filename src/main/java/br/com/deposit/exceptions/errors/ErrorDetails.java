package br.com.deposit.exceptions.errors;

public record ErrorDetails(
        int statusCode,
        String timestamp,
        String message
) {
}
