package com.project.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.UserDetail;
import com.project.librarymanagement.exceptions.InvalidDataException;
import com.project.librarymanagement.models.UserModel;
import com.project.librarymanagement.repositories.UserInfoRepository;
import com.project.librarymanagement.transformers.UserInfoTransformer;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Autowired
	private UserInfoTransformer userInfoTransformer;

	public UserDetail getUserInfo(final String email, final String password) {

		UserModel userInfo = userInfoRepository.findByEmailAddress(email);
		if (userInfo.getOriginalPassword().equals(password)) {
			return userInfoTransformer.toUserInfo(userInfo);
		} else {
			throw new InvalidDataException(
					"Email id Not registered:" + userInfo.getUserFirstName() + userInfo.getUserLastName());
		}
	}

}
