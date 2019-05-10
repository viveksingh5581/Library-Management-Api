package com.project.librarymanagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.project.librarymanagement.exceptions.InvalidDataException;

@ControllerAdvice
public class LibraryManagementExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(InvalidDataException.class)
    protected ResponseEntity<Object> handleInvalidData(Exception exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }
}
