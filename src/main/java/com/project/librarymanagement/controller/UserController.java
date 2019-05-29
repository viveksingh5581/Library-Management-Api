package com.project.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.librarymanagement.domains.AppUserDomain;
import com.project.librarymanagement.domains.UserDetail;
import com.project.librarymanagement.service.UserInfoService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserInfoService userInfoService;

	@GetMapping("/permission")
	public UserDetail getUser(@RequestParam(name = "email", required = true) String email,
			@RequestParam(name = "password", required = true) String password) {

		return userInfoService.getUserInfo(email, password);
	}

	@PostMapping("/update/passowrd")
	public AppUserDomain updateUserPassword(@RequestBody AppUserDomain userDetail) {

		return userInfoService.updatePassword(userDetail);
	}

	@PostMapping("/update/names")
	public AppUserDomain updateUserFullName(@RequestBody AppUserDomain userDetail) {

		return userInfoService.updateName(userDetail);
	}
}
