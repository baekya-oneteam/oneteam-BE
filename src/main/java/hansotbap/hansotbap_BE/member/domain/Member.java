package hansotbap.hansotbap_BE.member.domain;

import hansotbap.hansotbap_BE.global.config.entity.BaseEntity;
import hansotbap.hansotbap_BE.global.config.entity.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private Status status;

    private String name;

    private String introduction;

    private Integer age;

    private String specialty;

    private String personalHistory;

    private String major;

    private boolean isInterview;

    private boolean isStudent;

    @Builder
    public Member(Status status, String name, String introduction, Integer age, String specialty,
                  String personalHistory, String major,boolean isInterview, boolean isStudent) {
        this.status = status;
        this.name = name;
        this.introduction = introduction;
        this.age = age;
        this.specialty = specialty;
        this.personalHistory = personalHistory;
        this.major = major;
        this.isInterview = isInterview;
        this.isStudent = isStudent;
    }


}
