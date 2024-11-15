package com.app.positionback.domain.interview;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class InterviewVO {
    @EqualsAndHashCode.Include
    private Long id;
    private Long corporationId;
    private Long resumeId;
    private String interviewDate;
    private String interviewStatus;
}
