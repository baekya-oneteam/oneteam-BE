package hansotbap.hansotbap_BE.feedback.api.dto.response;

import hansotbap.hansotbap_BE.feedback.domain.Feedback;
import hansotbap.hansotbap_BE.member.api.dto.response.CreateMemberResDto;
import hansotbap.hansotbap_BE.member.domain.Member;
import lombok.Builder;

@Builder
public record CreateFeedbackResDto(
        String goodFeedback,
        String badFeedback,
        String hopeFeedback) {
    public static CreateFeedbackResDto from(Feedback feedback) {
        return CreateFeedbackResDto.builder()
                .goodFeedback(feedback.getGoodFeedback())
                .badFeedback(feedback.getBadFeedback())
                .hopeFeedback(feedback.getHopeFeedback())
                .build();
    }
}