package com.syhy.git_team_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class JunboemController {

    @GetMapping("/junboem")
    public MemberResponseDTO jake() {
        return MemberResponseDTO.builder()
                .name("junboem")
                .email("junboem@gmail.com")
                .age("20")
                .build();
    }
}
