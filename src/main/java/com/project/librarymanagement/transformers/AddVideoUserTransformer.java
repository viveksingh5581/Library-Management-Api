package com.project.librarymanagement.transformers;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.AddVideoInfoDomain;
import com.project.librarymanagement.models.AddVideoInfoModel;


@Component 
public class AddVideoUserTransformer {

		public AddVideoInfoDomain toVideoInfo(final AddVideoInfoModel addVideoInfoModel) {
			AddVideoInfoDomain addVideoInfo = new AddVideoInfoDomain();
			addVideoInfo.setVideoId(addVideoInfoModel.getVideoId());
			addVideoInfo.setUserId(addVideoInfoModel.getUserId());
			addVideoInfo.setVideoTitle(addVideoInfoModel.getVideoTitle());
			addVideoInfo.setDirectorName(addVideoInfoModel.getDirectorName());
			addVideoInfo.setCategoryId(addVideoInfoModel.getCategoryId());
			addVideoInfo.setReleaseYear(addVideoInfoModel.getReleaseYear());
			addVideoInfo.setVideoPrice(addVideoInfoModel.getVideoPrice());
			addVideoInfo.setVideoRating(addVideoInfoModel.getVideoRating());
			
			return addVideoInfo;
	}
	
		public AddVideoInfoModel toVideoInfo(final AddVideoInfoDomain addVideoInfoDomain) {
			AddVideoInfoModel addVideoInfoModel = new AddVideoInfoModel();
			addVideoInfoModel.setUserId(addVideoInfoDomain.getUserId());
			addVideoInfoModel.setVideoId(addVideoInfoDomain.getVideoId());
			addVideoInfoModel.setVideoTitle(addVideoInfoDomain.getVideoTitle());
			addVideoInfoModel.setDirectorName(addVideoInfoDomain.getDirectorName());
			addVideoInfoModel.setCategoryId(addVideoInfoDomain.getCategoryId());
			addVideoInfoModel.setReleaseYear(addVideoInfoDomain.getReleaseYear());
			addVideoInfoModel.setVideoPrice(addVideoInfoDomain.getVideoPrice());
			addVideoInfoModel.setVideoRating(addVideoInfoDomain.getVideoRating());
			
			return addVideoInfoModel;
	}
}
