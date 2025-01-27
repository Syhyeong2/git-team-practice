package com.syhy.git_team_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class JonggeunController {

    @GetMapping("/jonggeun")
    public MemberResponseDTO jonggeun() {
        return MemberResponseDTO.builder()
                .name("종근")

                .email("afsd0104@gmail.com")
                .age("28")

                .build();
    }

}
