package hansotbap.hansotbap_BE.member.api.dto.response;

import hansotbap.hansotbap_BE.member.domain.Member;
import lombok.Builder;

@Builder
public record CreateMemberResDto(
        String name,
        String introduction,
        Integer age,
        String specialty,
        String personalHistory,
        String major,
        boolean isInterview,
        boolean isStudent

) {
    public static CreateMemberResDto from(Member member) {
        return CreateMemberResDto.builder()
                .name(member.getName())
                .introduction(member.getIntroduction())
                .age(member.getAge())
                .specialty(member.getSpecialty())
                .personalHistory(member.getPersonalHistory())
                .major(member.getMajor())
                .isInterview(member.isInterview())
                .isStudent(member.isStudent())
                .build();
    }
}