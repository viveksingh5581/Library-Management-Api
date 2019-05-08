package com.project.librarymanagement.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "VW_VIDEODETAILS_STATUS")

	public class VideoInfoModel {
		@Id
		@Column(name = "USER_ID")
		private int userId;

		@Column(name = "VIDEO_ID")
		private int videoId;

		@Column(name = "VIDEO_TITLE")
		private String videoTitle;

		@Column(name = "DIRECTOR_NAME")
		private String directorName;

		@Column(name = "VIDEO_RATING")
		private float videoRating;

		@Column(name = "VIDEO_PRICE")
		private float videoPrice;

		@Temporal(TemporalType.DATE)
		@Column(name = "RELEASE_YEAR")
		private Date releaseYear;

		@Column(name = "CATEGORY_DESCRIPTION")
		private String categoryDescription;
	}

