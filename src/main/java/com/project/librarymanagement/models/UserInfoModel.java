package com.project.librarymanagement.models;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "VW_USERINFO_STATUS")
public class UserInfoModel {
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
    
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_AT")
    private Date updatedAt;
	
    @Column(name = "ENCRYPTED_PASSWORD")
    private byte[] encryptedPassword;
    
    @Column(name = "ORIGINAL_PASSWORD")
    private String originalPassword;
    
    @Column(name = "IS_VALID")
    private boolean isValid;
    
    @Column(name = "ROLE_ID")
    private String roleId;
    
    @Column(name = "ROLE_NAME")
    private String roleName;
    
    @Override
    public String toString() {
        return "User{" +
                "userName=" + userFirstName + " " + userLastName;
                     }
}



