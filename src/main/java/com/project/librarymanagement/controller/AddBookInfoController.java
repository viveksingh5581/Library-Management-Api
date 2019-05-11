package com.project.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.librarymanagement.domains.AddBookInfoDomain;
import com.project.librarymanagement.service.AddBookUserService;

@RestController
@RequestMapping(value = "/books")
public class AddBookInfoController {
	@Autowired
	private AddBookUserService addBookUserService;

	@PostMapping("/createBook")
	public AddBookInfoDomain registerBook(@RequestBody AddBookInfoDomain addBookInfoDomain) {
		return addBookUserService.registerBookInfo(addBookInfoDomain);
	}
}
