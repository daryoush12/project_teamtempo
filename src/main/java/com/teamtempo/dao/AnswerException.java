package com.teamtempo.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class AnswerException extends RuntimeException {
public AnswerException(Exception cause){
	super(cause);
}
}
