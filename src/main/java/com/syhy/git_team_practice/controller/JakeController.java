package com.syhy.git_team_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class JakeController {

    @GetMapping("/jake")
    public MemberResponseDTO jake() {
        return MemberResponseDTO.builder()
                .name("jake")
                .email("jake@gmail.com")
                .age("25")
                .build();
    }
}
