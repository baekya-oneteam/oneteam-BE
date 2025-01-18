package hansotbap.hansotbap_BE.member;

import hansotbap.hansotbap_BE.global.config.entity.BaseEntity;
import hansotbap.hansotbap_BE.global.config.entity.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private Status status;

    private Integer age;

    private String specialty;

    private String personalHistory;

    private boolean isInterview;

    private boolean IsStudent;

   public Member(Status status, Integer age, String specialty, String personalHistory, boolean isInterview, boolean isStudent) {
        this.status = status;
        this.age = age;
        this.specialty = specialty;
        this.personalHistory = personalHistory;
        this.isInterview = isInterview;
        IsStudent = isStudent;
    }
}
