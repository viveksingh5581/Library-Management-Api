package com.project.librarymanagement.transformers;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.VideoInfoDomain;
import com.project.librarymanagement.models.VideoInfoModel;

@Component 
public class VideoInfoTransformer {
	
	public VideoInfoDomain toVideoInfo(final VideoInfoModel videoInfoModel) {
		
		VideoInfoDomain videoInfo = new VideoInfoDomain();
		videoInfo.setCategoryDescription(videoInfoModel.getCategoryDescription());
		videoInfo.setVideoId(videoInfoModel.getVideoId());
		videoInfo.setDirectorName(videoInfoModel.getDirectorName());
		videoInfo.setReleaseYear(videoInfoModel.getReleaseYear());
		videoInfo.setVideoPrice(videoInfoModel.getVideoPrice());
		videoInfo.setVideoRating(videoInfoModel.getVideoRating());

	return videoInfo;
	}
}


