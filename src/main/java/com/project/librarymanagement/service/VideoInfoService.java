package com.project.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.VideoInfoDomain;
import com.project.librarymanagement.models.VideoInfoModel;
import com.project.librarymanagement.repositories.VideoInfoRepository;
import com.project.librarymanagement.transformers.VideoInfoTransformer;


@Service
public class VideoInfoService {

	@Autowired
	private VideoInfoRepository videoInfoRepository;

	@Autowired
	private VideoInfoTransformer videoInfoTransformer;

	public VideoInfoDomain getVideoInfo(final String videoTitle) {
		VideoInfoModel videoInfo = videoInfoRepository.findByvideoTitle(videoTitle);
		return videoInfoTransformer.toVideoInfo(videoInfo);
	}
}
