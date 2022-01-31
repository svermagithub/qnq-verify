package com.qnq.cis.model.request.payrolldata;

import lombok.Data;

@Data
public class AddressesItem{
	private String country;
	private String expnUnparsedAddress;
	private String city;
	private String postalCode;
	private String line3;
	private String region;
	private String type;
	private String line2;
	private String line1;
}