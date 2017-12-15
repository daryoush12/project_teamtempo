package com.teamtempo.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	
	
	
	
	@GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String RespondOK() throws Exception{
            return "OK";
        }
    

}
