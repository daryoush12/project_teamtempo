package com.teamtempo.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class SurveyException extends RuntimeException {
	public SurveyException(Exception cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
