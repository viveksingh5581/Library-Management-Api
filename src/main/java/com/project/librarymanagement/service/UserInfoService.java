package com.project.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.AppUserDomain;
import com.project.librarymanagement.domains.UserDetail;
import com.project.librarymanagement.exceptions.InvalidDataException;
import com.project.librarymanagement.models.AppUserModel;
import com.project.librarymanagement.models.UserModel;
import com.project.librarymanagement.repositories.AppUserRepository;
import com.project.librarymanagement.repositories.UserInfoRepository;
import com.project.librarymanagement.transformers.AppUserTransformer;
import com.project.librarymanagement.transformers.UserInfoTransformer;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private AppUserRepository appUserRepository;

	@Autowired
	private UserInfoTransformer userInfoTransformer;
	
	@Autowired
	private AppUserTransformer appUserTransformer;

	public UserDetail getUserInfo(final String email, final String password) {

		UserModel userInfo = userInfoRepository.findByEmailAddress(email);
		if (userInfo.getOriginalPassword().equals(password)) {
			return userInfoTransformer.toUserInfo(userInfo);
		} else {
			throw new InvalidDataException(
					"Email id Not registered:" + userInfo.getUserFirstName() + userInfo.getUserLastName());
		}
	}

	public AppUserDomain updatePassword(final AppUserDomain userDetail) {
		if(checkValidEmail(userDetail)) {
			AppUserModel savedUser = appUserRepository.save(appUserTransformer.toUserInfo(userDetail));
		}else {;
			throw new InvalidDataException(
					"Email id Not Found:" + userDetail.getEmailAddress());
	}
	return userDetail;
	}

	public AppUserDomain updateName(final AppUserDomain userDetail) {
		if(checkValidEmail(userDetail)) {
			appUserRepository.save(appUserTransformer.toUserInfo(userDetail));
		}else {
				throw new InvalidDataException(
						"Email id Not Found:" + userDetail.getEmailAddress());
		}
		return userDetail;
	}
	
	private boolean checkValidEmail(final AppUserDomain userDetail) {
		AppUserModel userInfo = appUserRepository.findByEmailAddress(userDetail.getEmailAddress());
		return userInfo.getEmailAddress().equals(userDetail.getEmailAddress());
	}
}
