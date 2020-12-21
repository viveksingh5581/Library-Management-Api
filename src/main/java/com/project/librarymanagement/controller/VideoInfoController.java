package com.project.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.librarymanagement.domains.BookInfoDomain;
import com.project.librarymanagement.domains.VideoInfoDomain;
import com.project.librarymanagement.service.BookInfoService;
import com.project.librarymanagement.service.VideoInfoService;

@RestController
@RequestMapping(value = "/videos")
public class VideoInfoController {
	@Autowired
	private VideoInfoService videoInfoService;

	@GetMapping("/{videoTitle}")
	public VideoInfoDomain getUser(@PathVariable(name = "videoTitle") String videoTitle) {
		return videoInfoService.getVideoInfo(videoTitle);
	}

}

