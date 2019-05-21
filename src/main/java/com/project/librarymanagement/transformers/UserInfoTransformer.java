package com.project.librarymanagement.transformers;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.UserDetail;
import com.project.librarymanagement.models.UserModel;

@Component 
public class UserInfoTransformer {
	
	public UserDetail toUserInfo(final UserModel userInfoModel) {
		UserDetail userInfo = new UserDetail();
		userInfo.setEmailAddress(userInfoModel.getEmailAddress());
		userInfo.setUserId(userInfoModel.getUserId());
		userInfo.setValid(userInfoModel.isValid());
		userInfo.setUserFirstName(userInfoModel.getUserFirstName());
		userInfo.setUserLastName(userInfoModel.getUserLastName());
		
		return userInfo;
	}
}
