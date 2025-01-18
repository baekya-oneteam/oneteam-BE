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
    private String content;

    @ManyToOne
    @JoinColumn(name = "member")
    private Member member;

    @Builder
    public Feedback(String content, Member member) {
        this.content = content;
        this.member = member;
    }
}
