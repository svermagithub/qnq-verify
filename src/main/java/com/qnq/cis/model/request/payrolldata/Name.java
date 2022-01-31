package com.qnq.cis.model.request.payrolldata;

import lombok.Data;

@Data
public class Name{
	private String middle;
	private String last;
	private String prefix;
	private String company;
	private String expnUnparsedName;
	private String suffix;
	private String first;
}