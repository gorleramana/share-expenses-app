/**
 * 
 */
package com.rg.web.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author gorle
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	   @ExceptionHandler(ResourceNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public ErrorResponse handleResourceNotFound(ResourceNotFoundException ex) {
	        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), 
	                                "Resource Not Found", 
	                                ex.getMessage());
	    }

	    @ExceptionHandler(MethodArgumentNotValidException.class)
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public ErrorResponse handleValidationExceptions(MethodArgumentNotValidException ex) {
	        List<String> errors = ex.getBindingResult()
	                                .getFieldErrors()
	                                .stream()
	                                .map(FieldError::getDefaultMessage)
	                                .collect(Collectors.toList());
	        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), 
	                                "Validation Error", 
	                                errors);
	    }

	    @ExceptionHandler(Exception.class)
	    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	    public ErrorResponse handleAllExceptions(Exception ex) {
	        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), 
	                                "Internal Server Error", 
	                                "An unexpected error occurred");
	    }
	    
	    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	    @ResponseStatus(HttpStatus.CONFLICT)
	    public ErrorResponse handleMediaTypeException(HttpMediaTypeNotAcceptableException ex) {
	        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), 
	                                "Internal Server Error", 
	                                "No acceptable media types found");
	    }
	}
