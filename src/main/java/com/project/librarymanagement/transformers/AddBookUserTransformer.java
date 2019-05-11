package com.project.librarymanagement.transformers;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.librarymanagement.domains.AddBookInfoDomain;
import com.project.librarymanagement.models.AddBookInfoModel;

@Component 
public class AddBookUserTransformer {
	
	public AddBookInfoDomain toBookInfo(final AddBookInfoModel addBookInfoModel) {
		AddBookInfoDomain addBookInfo = new AddBookInfoDomain();
		addBookInfo.setUserId(addBookInfoModel.getUserId());
		addBookInfo.setBookDetailsTitle(addBookInfoModel.getBookDetailsTitle());
		addBookInfo.setBookDetailsIsbnCode(addBookInfoModel.getBookDetailsIsbnCode());
		addBookInfo.setAuthorName(addBookInfoModel.getAuthorName());
		addBookInfo.setBindingId(addBookInfoModel.getBindingId());
		addBookInfo.setBookLanguage(addBookInfoModel.getBookLanguage());
		addBookInfo.setBookPrice(addBookInfoModel.getBookPrice());
		addBookInfo.setCategoryId(addBookInfoModel.getCategoryId());
		addBookInfo.setNoOfCopiesActual(addBookInfoModel.getNoOfCopiesActual());
		addBookInfo.setPublicationName(addBookInfoModel.getPublicationName());
		addBookInfo.setPublicationYear(addBookInfoModel.getPublicationYear());
		return addBookInfo;
	}
	
	
	public AddBookInfoModel toBookInfo(final AddBookInfoDomain addBookInfoDomain) {
		AddBookInfoModel addBookInfoModel = new AddBookInfoModel();
		addBookInfoModel.setUserId(addBookInfoDomain.getUserId());
		addBookInfoModel.setBookDetailsTitle(addBookInfoDomain.getBookDetailsTitle());
		addBookInfoModel.setBookDetailsIsbnCode(addBookInfoDomain.getBookDetailsIsbnCode());
		addBookInfoModel.setAuthorName(addBookInfoDomain.getAuthorName());
		addBookInfoModel.setBindingId(addBookInfoDomain.getBindingId());
		addBookInfoModel.setBookLanguage(addBookInfoDomain.getBookLanguage());
		addBookInfoModel.setBookPrice(addBookInfoDomain.getBookPrice());
		addBookInfoModel.setCategoryId(addBookInfoDomain.getCategoryId());
		addBookInfoModel.setNoOfCopiesActual(addBookInfoDomain.getNoOfCopiesActual());
		addBookInfoModel.setPublicationName(addBookInfoDomain.getPublicationName());
		addBookInfoModel.setPublicationYear(addBookInfoDomain.getPublicationYear());
		return addBookInfoModel;
	}
}
