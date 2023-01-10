package br.com.deposit.exceptions.errors;

public record Violation(
        String fieldName,
        String message
) {
}
