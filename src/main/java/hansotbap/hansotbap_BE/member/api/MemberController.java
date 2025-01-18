package hansotbap.hansotbap_BE.member.api;


import hansotbap.hansotbap_BE.global.template.RspTemplate;
import hansotbap.hansotbap_BE.member.api.dto.request.CreateMemberReqDto;
import hansotbap.hansotbap_BE.member.api.dto.response.CreateMemberResDto;
import hansotbap.hansotbap_BE.member.application.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public RspTemplate<CreateMemberResDto> joinRequest(@RequestBody CreateMemberReqDto createMemberReqDto) {
        return new RspTemplate<>(HttpStatus.OK,
                "가입 요청",
                memberService.createMember(createMemberReqDto));
    }
}