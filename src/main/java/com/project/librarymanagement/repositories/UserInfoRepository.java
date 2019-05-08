package com.project.librarymanagement.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.librarymanagement.models.UserInfoModel;

@Repository
public interface UserInfoRepository extends  JpaRepository <UserInfoModel,Integer>{

	UserInfoModel findByUserId(Integer userId);
	
	List<UserInfoModel> findByUserId(Iterable<Integer> ids);
	
	List<UserInfoModel> findByUserName(String userName);
	
	List<UserInfoModel> findByEmailAddress(String emailAddress);
}
