package hansotbap.hansotbap_BE.global.config.error.dto;

public record ErrorResponse(
        int statusCode,
        String message
) {
}