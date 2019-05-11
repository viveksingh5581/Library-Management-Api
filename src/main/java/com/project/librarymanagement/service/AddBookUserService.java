package com.project.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.AddBookInfoDomain;
import com.project.librarymanagement.exceptions.InvalidDataException;
import com.project.librarymanagement.models.AddBookInfoModel;
import com.project.librarymanagement.repositories.AddBookUserRepository;
import com.project.librarymanagement.transformers.AddBookUserTransformer;

@Service
public class AddBookUserService {

	@Autowired
	private AddBookUserRepository addBookUserRepository;

	@Autowired
	private AddBookUserTransformer addBookUserTransformer;

	private AddBookInfoModel getBookInfo(final Integer userId) {
		return addBookUserRepository.findByUserId(userId);
	}

	public AddBookInfoDomain registerBookInfo(final AddBookInfoDomain addBookInfoDomain) {
		validateUserId(addBookInfoDomain.getUserId());
		validateUserName(addBookInfoDomain.getBookDetailsTitle());
		validateAuthorName(addBookInfoDomain.getAuthorName());
		validateBookPublicationName(addBookInfoDomain.getPublicationName());
		AddBookInfoModel savedUser = addBookUserRepository.save(addBookUserTransformer.toBookInfo(addBookInfoDomain));
		return addBookUserTransformer.toBookInfo(savedUser);
	}
	
	private void validateUserId(final int userId) {
		AddBookInfoModel existingUser = getBookInfo(userId);
		if (existingUser != null) {
			throw new InvalidDataException("User already exists for id :" + existingUser.getUserId());
		}
	}
	
	private void validateUserName(final String bookDetailsTitle) {
		AddBookInfoModel existingUser = addBookUserRepository.findBybookDetailsTitle(bookDetailsTitle);
		if (existingUser != null) {
			throw new InvalidDataException("User already exists for userName :" + bookDetailsTitle);
		}
	}
	
	private void validateAuthorName(final String authorName) {
		AddBookInfoModel existingUser = addBookUserRepository.findByAuthorName(authorName);
		if (existingUser != null) {
			throw new InvalidDataException("Book already exists for Author :" + authorName);
		}
	}
	private void validateBookPublicationName(final String publicationName) {
		AddBookInfoModel existingUser = addBookUserRepository.findByPublicationName(publicationName);
		if (existingUser != null) {
			throw new InvalidDataException("Book already exists for Author with Publication Name :" + publicationName);
		}
	}
}
