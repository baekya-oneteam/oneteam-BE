package hansotbap.hansotbap_BE.feedback.api;


import hansotbap.hansotbap_BE.feedback.api.dto.request.CreateFeedbackReqDto;
import hansotbap.hansotbap_BE.feedback.api.dto.response.CreateFeedbackResDto;
import hansotbap.hansotbap_BE.feedback.application.FeedbackService;
import hansotbap.hansotbap_BE.global.template.RspTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @PostMapping("/{memberId}")
    public RspTemplate<CreateFeedbackResDto> createFeedback(
            @PathVariable Long memberId,
            @RequestBody CreateFeedbackReqDto createFeedbackReqDto) {
        return new RspTemplate<>(HttpStatus.OK,
                "피드백 생성",
                feedbackService.saveFeedback(memberId, createFeedbackReqDto));
    }
}