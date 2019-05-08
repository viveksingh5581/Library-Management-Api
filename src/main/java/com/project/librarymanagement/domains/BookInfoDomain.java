package com.project.librarymanagement.domains;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@JsonInclude(Include.NON_NULL)

public class BookInfoDomain {
	//private int userId;
	private String bookDetailsIsbnCode;
	private String bookDetailsTitle;
	private String bookLanguage;
	private long bindingId;
	private int noOfCopiesActual;
	private String categoryDescription;
	private Date publicationYear;
	private String authorId;
	private String publicationName;
	private double bookPrice;
}
