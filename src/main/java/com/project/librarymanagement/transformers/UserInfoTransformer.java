package com.project.librarymanagement.transformers;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.UserInfoDomain;
import com.project.librarymanagement.models.UserInfoModel;

@Component 
public class UserInfoTransformer {
	
	public UserInfoDomain toUserInfo(final UserInfoModel userInfoModel) {
		UserInfoDomain userInfo = new UserInfoDomain();
		userInfo.setEmailAddress(userInfoModel.getEmailAddress());
		userInfo.setUserId(userInfoModel.getUserId());
		userInfo.setUserName(userInfoModel.getUserName());
		userInfo.setValid(userInfoModel.isValid());
		return userInfo;
	}
	
	public UserInfoModel toUserInfo(final UserInfoDomain userInfoDomain) {
		UserInfoModel userInfoModel = new UserInfoModel();
	    userInfoModel.setOriginalPassword(userInfoDomain.getOriginalPassword());
	    userInfoModel.setEmailAddress(userInfoDomain.getEmailAddress());
	    userInfoModel.setUserFirstName(userInfoDomain.getUserFirstName());
	    userInfoModel.setUserLastName(userInfoDomain.getUserLastName());
	    userInfoModel.setUserName(userInfoDomain.getUserName());
	    userInfoModel.setOriginalPassword(userInfoDomain.getOriginalPassword());
	    userInfoModel.setCreatedAt(new Date());
		return userInfoModel;
	}
}
