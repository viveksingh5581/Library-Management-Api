package com.project.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.librarymanagement.domains.AppUserDomain;
import com.project.librarymanagement.service.AppUserService;

@RestController
@RequestMapping(value = "/users")
public class AppUserController {
	@Autowired
	private AppUserService appUserService;

	// @GetMapping("/{userId}")
	// public UserInfoDomain getUser(@PathVariable (name = "userId") Integer userId)
	// {
	// return userInfoService.getUserInfo(userId);
	// }

	@PostMapping("/createUser")
	public AppUserDomain registerUser(@RequestBody AppUserDomain appUserDomain) {
		return appUserService.registerUserInfo(appUserDomain);
	}
}
