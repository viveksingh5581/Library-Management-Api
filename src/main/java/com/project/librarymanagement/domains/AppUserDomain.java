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
public class AppUserDomain {

	private int userId;
	private String userName;
	private String userFirstName;
	private String userLastName;
	private String emailAddress;
	private Date createdAt;
	private String originalPassword;
	private boolean isValid;
}



