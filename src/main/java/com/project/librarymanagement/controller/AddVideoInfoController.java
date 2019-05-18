package com.project.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.librarymanagement.domains.AddVideoInfoDomain;
import com.project.librarymanagement.service.AddVideoUserService;

@RestController
@RequestMapping(value = "/videos")
public class AddVideoInfoController {
	@Autowired
	private AddVideoUserService addVideoUserService;

	@PostMapping("/createVideo")
	public AddVideoInfoDomain registerVideo(@RequestBody AddVideoInfoDomain addVideoInfoDomain) {
		return addVideoUserService.registerVideoInfo(addVideoInfoDomain);
	}
}
