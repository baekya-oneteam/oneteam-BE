package hansotbap.hansotbap_BE.member.domain.reposiotry;

import hansotbap.hansotbap_BE.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends
        JpaRepository<Member, Long> {
}