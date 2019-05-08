package com.project.librarymanagement.transformers;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.BookInfoDomain;
import com.project.librarymanagement.models.BookInfoModel;

@Component 
public class BookInfoTransformer {
	
	public BookInfoDomain toBookInfo(final BookInfoModel bookInfoModel) {
		
		BookInfoDomain bookInfo = new BookInfoDomain();
		bookInfo.setBookDetailsIsbnCode(bookInfoModel.getBookDetailsIsbnCode());
		bookInfo.setBookDetailsTitle(bookInfoModel.getBookDetailsTitle());
		bookInfo.setBookLanguage(bookInfoModel.getBookLanguage());
		bookInfo.setBookPrice(bookInfoModel.getBookPrice());
		bookInfo.setCategoryDescription(bookInfoModel.getCategoryDescription());
		bookInfo.setNoOfCopiesActual(bookInfoModel.getNoOfCopiesActual());
		bookInfo.setPublicationName(bookInfoModel.getPublicationName());
		bookInfo.setPublicationYear(bookInfoModel.getPublicationYear());
		bookInfo.setAuthorId(bookInfoModel.getAuthorId());
		bookInfo.setBindingId(bookInfoModel.getBindingId());
		return bookInfo;
	}
}
