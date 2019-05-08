package com.project.librarymanagement.repositories;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.librarymanagement.models.VideoInfoModel;

@Repository
public interface VideoInfoRepository extends  JpaRepository <VideoInfoModel,String>{
 
	VideoInfoModel findByvideoTitle(String videoTitle);
	List <VideoInfoModel> findByCategoryDescription(String categoryDescription);
    List <VideoInfoModel> findByDirectorName(String directorName);
    List <VideoInfoModel> findByreleaseYear(String releaseYear);
}
