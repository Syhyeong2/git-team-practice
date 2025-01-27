package com.syhy.git_team_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class MyungGeunController {


    @GetMapping("/myunggeun")
    public MemberResponseDTO myunggeun() {
        return MemberResponseDTO.builder()
                .name("명근")
                .email("kmg6152@gmail.com")
                .age("30")
                .build();
    }
}
