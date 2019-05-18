package com.project.librarymanagement.domains;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@JsonInclude(Include.NON_NULL)
public class AddVideoInfoDomain {

	private int userId;

	private int videoId;

	private String videoTitle;

	private String directorName;

	private float videoRating;

	private float videoPrice;

	private Date releaseYear;

	private int categoryId;
}

