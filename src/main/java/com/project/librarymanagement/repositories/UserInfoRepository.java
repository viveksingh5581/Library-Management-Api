package com.project.librarymanagement.repositories;
import com.project.librarymanagement.models.UserInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserInfoRepository extends  JpaRepository <UserInfoModel,Integer>{

	UserInfoModel findByUserId(Integer userId);
	
	List<UserInfoModel> findByUserId(Iterable<Integer> ids);
	
	List<UserInfoModel> findByUserName(String userName);
	
	List<UserInfoModel> findByEmailAddress(String emailAddress);
}
