package com.project.librarymanagement.transformers;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.UserInfo;
import com.project.librarymanagement.models.UserInfoModel;

@Component 
public class UserInfoTransformer {
	
	public UserInfo toUserInfo(final UserInfoModel userInfoModel) {
		
		UserInfo userInfo = new UserInfo();
		userInfo.setCreatedAt(userInfoModel.getCreatedAt());
		userInfo.setUpdatedAt(userInfoModel.getUpdatedAt());
		userInfo.setEmailAddress(userInfoModel.getEmailAddress());
		userInfo.setUserId(userInfoModel.getUserId());
		userInfo.setUserName(userInfoModel.getUserName());
		userInfo.setValid(userInfoModel.isValid());
		return userInfo;
	}
}
