package com.qnq.cis.model.request;

import lombok.Data;

@Data
public class CurrentAddress{
	private String zipCode;
	private String city;
	private String state;
	private String line3;
	private String line2;
	private String line1;
}