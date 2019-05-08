package com.project.librarymanagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.librarymanagement.domains.BookInfoDomain;
import com.project.librarymanagement.models.BookInfoModel;
import com.project.librarymanagement.repositories.BookInfoRepository;
import com.project.librarymanagement.transformers.BookInfoTransformer;


@Service
public class BookInfoService {

	@Autowired
	private BookInfoRepository bookInfoRepository;

	@Autowired
	private BookInfoTransformer bookInfoTransformer;

	public BookInfoDomain getBookInfo(final String bookDetailsTitle) {
		BookInfoModel bookInfo = bookInfoRepository.findByBookDetailsTitle(bookDetailsTitle);
		return bookInfoTransformer.toBookInfo(bookInfo);
	}
}