package hansotbap.hansotbap_BE.feedback.application;

import hansotbap.hansotbap_BE.feedback.api.dto.request.CreateFeedbackReqDto;
import hansotbap.hansotbap_BE.feedback.api.dto.response.CreateFeedbackResDto;
import hansotbap.hansotbap_BE.feedback.domain.Feedback;
import hansotbap.hansotbap_BE.feedback.domain.reposiotry.FeedbackRepository;
import hansotbap.hansotbap_BE.member.domain.Member;
import hansotbap.hansotbap_BE.member.domain.reposiotry.MemberRepository;
import hansotbap.hansotbap_BE.member.exception.MemberNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public CreateFeedbackResDto saveFeedback(Long memberId, CreateFeedbackReqDto createFeedbackReqDto) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(MemberNotFoundException::new);

        Feedback feedback = Feedback.builder()
                .goodFeedback(createFeedbackReqDto.goodFeedback())
                .badFeedback(createFeedbackReqDto.badFeedback())
                .hopeFeedback(createFeedbackReqDto.hopeFeedback())
                .member(member)
                .build();

        feedbackRepository.save(feedback);

        return CreateFeedbackResDto.from(feedback);
    }
}
