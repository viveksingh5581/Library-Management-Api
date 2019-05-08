package com.project.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.librarymanagement.domains.UserInfoDomain;
import com.project.librarymanagement.service.UserInfoService;

@RestController
@RequestMapping(value = "/users")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;

	@GetMapping("/{userId}")
	public UserInfoDomain getUser(@PathVariable (name = "userId") Integer userId) {
		return userInfoService.getUserInfo(userId);
	}

}
