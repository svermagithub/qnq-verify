package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class Employee{
	private List<String> emails;
	private List<AddressesItem> addresses;
	private List<ExpnGovernmentIdItem> expnGovernmentId;
	private Name name;
	private List<TelephonesItem> telephones;
	private String dateOfBirth;
}