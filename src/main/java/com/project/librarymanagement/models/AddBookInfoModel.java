package com.project.librarymanagement.models;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "BOOK_DETAILS")
public class AddBookInfoModel {
    @Id
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "BOOK_DETAILS_ISBN_CODE")
    private String bookDetailsIsbnCode;
    
    @Column(name = "BOOK_DETAILS_TITLE")
    private String bookDetailsTitle;
    
    @Column(name = "BOOK_DETAILS_LANGUAGE")
    private String bookLanguage;
    
    @Column(name = "BINDING_ID")
    private long bindingId;
    
    @Column(name = "NO_COPIES_ACTUAL")
    private int noOfCopiesActual;
    
    @Column(name = "CATEGORY_ID")
    private int categoryId;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "PUBLICATION_YEAR")
    private Date publicationYear;
    
    @Column(name = "AUTHOR_NAME")
    private String authorName;
   
    @Column(name = "PUBLICATION_NAME")
    private String publicationName;
    
    @Column(name = "BOOK_PRICE_IN_INR")
    private double bookPrice;
}


