package com.project.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.UserInfo;
import com.project.librarymanagement.models.UserInfoModel;
import com.project.librarymanagement.repositories.UserInfoRepository;
import com.project.librarymanagement.transformers.UserInfoTransformer;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Autowired
	private UserInfoTransformer userInfoTransformer;

	public UserInfo getUserInfo(final Integer userId) {
		UserInfoModel userInfo = userInfoRepository.findByUserId(userId);
		return userInfoTransformer.toUserInfo(userInfo);
	}

}
