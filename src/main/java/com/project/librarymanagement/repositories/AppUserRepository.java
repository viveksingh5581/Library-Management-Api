package com.project.librarymanagement.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.librarymanagement.domains.AppUserDomain;
import com.project.librarymanagement.models.AppUserModel;

@Repository
public interface AppUserRepository extends  JpaRepository <AppUserModel,Integer>{

	AppUserModel findByUserId(Integer userId);
	
	List<AppUserModel> findByUserId(Iterable<Integer> ids);
	
	AppUserModel findByUserName(String userName);
	
	AppUserModel findByEmailAddress(String emailAddress);
}
