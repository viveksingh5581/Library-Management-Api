package com.project.librarymanagement.models;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "APP_USER")
public class AppUserModel {

	@Id
    @Column(name = "USER_ID")
    private int userId;
    
    @Column(name = "USER_NAME")
    private String userName;
    
    @Column(name = "USER_FIRST_NAME")
    private String userFirstName;
    
    @Column(name = "USER_LAST_NAME")
    private String userLastName;
    
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_AT")
    private Date createdAt;
    
    @Column(name = "ORIGINAL_PASSWORD")
    private String originalPassword;
    
    @Column(name = "IS_VALID")
    private boolean isValid;

}

