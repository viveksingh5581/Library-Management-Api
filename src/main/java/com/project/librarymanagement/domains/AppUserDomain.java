package com.project.librarymanagement.domains;
import java.util.Date;

import lombok.Data;

@Data
public class AppUserDomain {
	private String userName;
	private String userFirstName;
	private String userLastName;
	private String emailAddress;
	private Date createdAt;
	private String originalPassword;
	private boolean isValid;
}



