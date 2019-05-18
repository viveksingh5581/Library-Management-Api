package com.project.librarymanagement.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.AddVideoInfoDomain;
import com.project.librarymanagement.exceptions.InvalidDataException;
import com.project.librarymanagement.models.AddVideoInfoModel;
import com.project.librarymanagement.repositories.AddVideoUserRepository;
import com.project.librarymanagement.transformers.AddVideoUserTransformer;

@Service
public class AddVideoUserService {

	@Autowired
	private AddVideoUserRepository addVideoUserRepository;

	@Autowired
	private AddVideoUserTransformer addVideoUserTransformer;

	private AddVideoInfoModel getVideoInfo(final Integer videoId) {
		return addVideoUserRepository.findByUserId(videoId);
	}

	public AddVideoInfoDomain registerVideoInfo(final AddVideoInfoDomain addVideoInfoDomain) {
		validateVideoId(addVideoInfoDomain.getVideoId());

		validateVideoName(addVideoInfoDomain.getVideoTitle());
		validateDirectorName(addVideoInfoDomain.getDirectorName());
		AddVideoInfoModel savedVideoUser = addVideoUserRepository.save(addVideoUserTransformer.toVideoInfo(addVideoInfoDomain));
		return addVideoUserTransformer.toVideoInfo(savedVideoUser);
	}
	
	private void validateVideoId(final int videoId) {
		AddVideoInfoModel existingUser = getVideoInfo(videoId);
		if (existingUser != null) {
			throw new InvalidDataException("User already exists for id :" + existingUser.getVideoId());
		}
	}
	
	private void validateVideoName(final String videoTitle) {
		AddVideoInfoModel existingUser = addVideoUserRepository.findByVideoTitle(videoTitle);
		if (existingUser != null) {
			throw new InvalidDataException("User already exists for userName :" + videoTitle);
		}
	}
	
	private void validateDirectorName(final String directorName) {
		AddVideoInfoModel existingUser = addVideoUserRepository.findByDirectorName(directorName);
		if (existingUser != null) {
			throw new InvalidDataException("Video already exists for director :" + directorName);
		}
	}
	

}

