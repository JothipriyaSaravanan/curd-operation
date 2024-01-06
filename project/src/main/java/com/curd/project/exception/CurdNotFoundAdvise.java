package com.curd.project.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
	public class CurdNotFoundAdvise {

	    @ResponseBody
	    @ExceptionHandler(CurdNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public Map<String,String> exceptionHandler(CurdNotFoundException exception){

	        Map<String,String> errorMap=new HashMap<>();
	        errorMap.put("errorMessage",exception.getMessage());

	        return errorMap;

	    }

	}

