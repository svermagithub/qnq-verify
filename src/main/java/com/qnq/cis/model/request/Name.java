package com.qnq.cis.model.request;

import lombok.Data;

@Data
public class Name{
	private String lastName;
	private String firstName;
	private String middleName;
	private String generationCode;
}