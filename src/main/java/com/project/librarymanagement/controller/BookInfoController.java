package com.project.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.librarymanagement.domains.BookInfoDomain;
import com.project.librarymanagement.service.BookInfoService;

@RestController
@RequestMapping(value = "/books")
public class BookInfoController {
	@Autowired
	private BookInfoService bookInfoService;

	@GetMapping("/{bookDetailsTitle}")
	public BookInfoDomain getUser(@PathVariable(name = "bookDetailsTitle") String bookDetailsTitle) {
		return bookInfoService.getBookInfo(bookDetailsTitle);
	}

}