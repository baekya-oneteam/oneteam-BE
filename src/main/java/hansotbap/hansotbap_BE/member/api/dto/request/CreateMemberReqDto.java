package hansotbap.hansotbap_BE.member.api.dto.request;

public record CreateMemberReqDto(
        String name,
        String introduction,
        Integer age,
        String specialty,
        String personalHistory,
        String major,
        boolean isInterview,
        boolean isStudent
) {
}