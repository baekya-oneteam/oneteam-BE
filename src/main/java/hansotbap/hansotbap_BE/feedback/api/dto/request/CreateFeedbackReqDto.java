package hansotbap.hansotbap_BE.feedback.api.dto.request;

public record CreateFeedbackReqDto(
        String goodFeedback,
        String badFeedback,
        String hopeFeedback) {
}