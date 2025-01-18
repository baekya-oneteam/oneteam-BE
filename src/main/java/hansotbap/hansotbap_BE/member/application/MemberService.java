package hansotbap.hansotbap_BE.member.application;

import hansotbap.hansotbap_BE.global.config.entity.Status;
import hansotbap.hansotbap_BE.member.api.dto.request.CreateMemberReqDto;
import hansotbap.hansotbap_BE.member.api.dto.response.CreateMemberResDto;
import hansotbap.hansotbap_BE.member.domain.Member;
import hansotbap.hansotbap_BE.member.domain.reposiotry.MemberRepository;
import java.time.LocalDateTime;
import java.time.ZoneId;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public CreateMemberResDto createMember(CreateMemberReqDto createMemberReqDto) {
        Member member = Member.builder()
                .status(Status.ACTIVE)
                .name(createMemberReqDto.name())
                .introduction(createMemberReqDto.introduction())
                .age(createMemberReqDto.age())
                .specialty(createMemberReqDto.specialty())
                .personalHistory(createMemberReqDto.personalHistory())
                .major(createMemberReqDto.major())
                .isInterview(createMemberReqDto.isInterview())
                .isStudent(createMemberReqDto.isStudent())
                .build();

        memberRepository.save(member);

        return CreateMemberResDto.from(member);
    }
}