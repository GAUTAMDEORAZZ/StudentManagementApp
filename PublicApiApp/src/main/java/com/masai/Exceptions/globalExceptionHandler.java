package com.masai.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class globalExceptionHandler {

	@ExceptionHandler(publicException.class)
	public ResponseEntity<myErrorDetails> publicExceptionHandler(publicException se, WebRequest req){
		
		
		myErrorDetails err= new myErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(se.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<myErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<myErrorDetails> otherExceptionHandler(Exception se, WebRequest req){
		
		
		myErrorDetails err= new myErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(se.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<myErrorDetails>(err, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
