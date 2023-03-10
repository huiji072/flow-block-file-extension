package com.flow.blockfileextensions.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class UpdateExtensionDto {
    @Size(min = 1, max = 20, message = "1자 이상 20자 이하로 입력해주세요.")
    private String name;
    private boolean blocked;
}
