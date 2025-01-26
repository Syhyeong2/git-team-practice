package com.syhy.git_team_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class MainController {

    @GetMapping("/")
    public MemberResponseDTO main() {
        return MemberResponseDTO.builder()
                .name("시형")
                .email("syhy@gmail.com")
                .age("25")
                .build();
    }
}
