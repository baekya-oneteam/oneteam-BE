package hansotbap.hansotbap_BE.feedback.domain.reposiotry;

import hansotbap.hansotbap_BE.feedback.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends
        JpaRepository<Feedback, Long> {
}
