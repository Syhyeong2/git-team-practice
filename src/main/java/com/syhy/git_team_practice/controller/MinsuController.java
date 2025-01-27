package com.syhy.git_team_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class MinsuController {

    @GetMapping("/minsu")
    public MemberResponseDTO minsu() {
        return MemberResponseDTO.builder()
                .name("민수")
                .email("minsu@gmail.com")
                .age("25")
                .build();
    }
    
    
}
