package com.app.positionback.domain.file;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CertificationFileVO {
    private Long fileId;
    private Long applyId;
}
