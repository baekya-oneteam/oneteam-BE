package hansotbap.hansotbap_BE.feedback.domain;

import hansotbap.hansotbap_BE.global.config.entity.BaseEntity;
import hansotbap.hansotbap_BE.member.domain.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Feedback extends BaseEntity {
    private String goodFeedback;
    private String badFeedback;
    private String hopeFeedback;

    @ManyToOne
    @JoinColumn(name = "member")
    private Member member;

    @Builder
    public Feedback(String goodFeedback, String badFeedback, String hopeFeedback, Member member) {
        this.goodFeedback = goodFeedback;
        this.badFeedback = badFeedback;
        this.hopeFeedback = hopeFeedback;
        this.member = member;
    }
}
