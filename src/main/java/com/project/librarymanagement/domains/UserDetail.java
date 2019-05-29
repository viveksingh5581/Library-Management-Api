package com.project.librarymanagement.domains;
import lombok.Data;

@Data
public class UserDetail {
	private int userId;
    private String userFirstName;
    private String userLastName;
    private String emailAddress;
    private String password;
    private boolean isValid;
}
