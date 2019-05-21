package com.project.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.AppUserDomain;
import com.project.librarymanagement.exceptions.InvalidDataException;
import com.project.librarymanagement.models.AppUserModel;
import com.project.librarymanagement.repositories.AppUserRepository;
import com.project.librarymanagement.transformers.AppUserTransformer;

@Service
public class AppUserService {

	@Autowired
	private AppUserRepository appUserRepository;

	@Autowired
	private AppUserTransformer appUserTransformer;

	public AppUserDomain registerUserInfo(final AppUserDomain appInfoDomain) {
		validateUserName(appInfoDomain.getUserName());
		validateUserEmail(appInfoDomain.getEmailAddress());
	
		AppUserModel savedUser = appUserRepository.save(appUserTransformer.toUserInfo(appInfoDomain));
		return appUserTransformer.toUserInfo(savedUser);
	}

	
	private void validateUserName(final String userName) {
		AppUserModel existingUser = appUserRepository.findByUserName(userName);
		if (existingUser != null) {
			throw new InvalidDataException("User already exists for userName :" + userName);
		}
	}
	
	private void validateUserEmail(final String emailAddress) {
		AppUserModel existingUser = appUserRepository.findByUserName(emailAddress);
		if (existingUser != null) {
			throw new InvalidDataException("User already exists for email address :" + emailAddress);
		}
	}
}
