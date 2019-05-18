package com.project.librarymanagement.transformers;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.AppUserDomain;
import com.project.librarymanagement.models.AppUserModel;

@Component 
public class AppUserTransformer {
	
	public AppUserDomain toUserInfo(final AppUserModel userInfoModel) {
		AppUserDomain userInfo = new AppUserDomain();
		userInfo.setEmailAddress(userInfoModel.getEmailAddress());
		userInfo.setUserId(userInfoModel.getUserId());
		userInfo.setUserName(userInfoModel.getUserName());
		userInfo.setValid(userInfoModel.isValid());
		return userInfo;
	}
	
	public AppUserModel toUserInfo(final AppUserDomain userInfoDomain) {
		AppUserModel userInfoModel = new AppUserModel();
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
