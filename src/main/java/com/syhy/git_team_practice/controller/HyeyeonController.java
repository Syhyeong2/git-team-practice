package com.syhy.git_team_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syhy.git_team_practice.dto.MemberResponseDTO;

@RestController
public class HyeyeonController {
	
	@GetMapping("/hyeyeon")
	public MemberResponseDTO hyeyeon() {
		return MemberResponseDTO.builder()
				.name("혜연")
				.email("hyeeon120@gmail.com")
				.age("25")
				.build();
	}
}
