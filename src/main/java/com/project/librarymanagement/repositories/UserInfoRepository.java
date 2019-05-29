package com.project.librarymanagement.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.librarymanagement.domains.UserDetail;
import com.project.librarymanagement.models.UserModel;

@Repository
public interface UserInfoRepository extends  JpaRepository <UserModel,Integer>{
	UserModel findByEmailAddress(String emailAddress);

	void save(UserDetail userDetail);
}
