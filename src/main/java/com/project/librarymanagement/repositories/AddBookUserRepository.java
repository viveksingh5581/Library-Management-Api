package com.project.librarymanagement.repositories;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.librarymanagement.models.AddBookInfoModel;

@Repository
public interface AddBookUserRepository extends  JpaRepository <AddBookInfoModel,Integer>{

	AddBookInfoModel findByUserId(Integer userId);
	
	AddBookInfoModel findBybookDetailsTitle(String bookDetailsTitle);
	
	AddBookInfoModel findByAuthorName(String authorId);
	
	AddBookInfoModel findByPublicationName(String publicationName);
	
}
