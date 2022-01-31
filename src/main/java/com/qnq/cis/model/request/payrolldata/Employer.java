package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class Employer{
	private String employerIdentificationNumber;
	private List<AddressesItem> addresses;
	private List<TelephonesItem> telephones;
	private String employerName;
	private String sic;
}