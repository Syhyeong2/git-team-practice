package com.syhy.git_team_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class SyhyeongController {

    @GetMapping("/syhyeong")
    public MemberResponseDTO hello() {
        return new MemberResponseDTO("syhyeong", "syhyeong@gmail.com", "25");
    }
}
