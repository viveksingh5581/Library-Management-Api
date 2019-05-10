package com.project.librarymanagement.domains;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@JsonInclude(Include.NON_NULL)
public class UserInfoDomain {

	private int userId;
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String emailAddress;
    private boolean isValid;
    private String roleName;
    private String originalPassword;
}
