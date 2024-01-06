package com.curd.project.exception;

public class CurdNotFoundException extends RuntimeException{
	    public CurdNotFoundException(Integer id){
	        super("Could not found the user with id "+ id);
	    }
	}

