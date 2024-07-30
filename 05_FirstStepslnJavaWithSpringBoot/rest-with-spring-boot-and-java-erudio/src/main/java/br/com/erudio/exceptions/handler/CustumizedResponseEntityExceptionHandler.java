package br.com.erudio.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.erudio.exceptions.ExceptionsResponse;
import br.com.erudio.exceptions.UnsuppoortedMathOperationException;

@ControllerAdvice
@RestController
public class CustumizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionsResponse> handleAllExceptions(
			Exception ex, WebRequest request) {
		ExceptionsResponse exceptionResponse = new ExceptionsResponse(
			new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsuppoortedMathOperationException.class)
	public final ResponseEntity<ExceptionsResponse> handleBadRequestExceptions(
			Exception ex, WebRequest request) {
		ExceptionsResponse exceptionResponse = new ExceptionsResponse(
				new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
}
