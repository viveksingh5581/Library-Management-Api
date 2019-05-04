package com.project.librarymanagement.domains;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@JsonInclude(Include.NON_NULL)
public class UserInfo {

	private int userId;
    private String userName;
    private String emailAddress;
    private boolean isValid;
    private Date createdAt;
    private Date updatedAt;
    private String roleName;
}
