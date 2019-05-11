package com.project.librarymanagement.domains;

import lombok.Data;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@JsonInclude(Include.NON_NULL)

public class AddBookInfoDomain {
	private int userId;
	private String bookDetailsIsbnCode;
	private String bookDetailsTitle;
	private String bookLanguage;
	private long bindingId;
	private int noOfCopiesActual;
	private int categoryId;
	private Date publicationYear;
	private String authorName;
	private String publicationName;
	private double bookPrice;
}
