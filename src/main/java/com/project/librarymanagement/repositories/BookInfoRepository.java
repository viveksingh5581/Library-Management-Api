package com.project.librarymanagement.repositories;
import com.project.librarymanagement.models.BookInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookInfoRepository extends  JpaRepository <BookInfoModel,String>{
 
	BookInfoModel findByBookDetailsTitle (String bookDetailsTitle);
	List <BookInfoModel> findByCategoryDescription(String categoryDescription);
	List <BookInfoModel> findByPublicationName(String publicationName);
	List <BookInfoModel> findByAuthorId(String authorId);
	List<BookInfoModel> findByCategoryId(Iterable<Integer> categoryId);
}
