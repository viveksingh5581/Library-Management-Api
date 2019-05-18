package com.project.librarymanagement.repositories;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.librarymanagement.models.AddVideoInfoModel;


@Repository
public interface AddVideoUserRepository extends  JpaRepository <AddVideoInfoModel,Integer>{

    AddVideoInfoModel findByVideoId(Integer videoId);
	
	AddVideoInfoModel findByUserId(Integer userId);
	
	AddVideoInfoModel findByVideoTitle(String videoTitle);
	
	AddVideoInfoModel findByDirectorName(String directorName);
	
	
}
