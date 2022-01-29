package com.qnq.cis.model.request;

import lombok.Data;

import java.util.List;

@Data
public class ApplicantInformation {
	private List<PhoneItem> phone;
	private Dob dob;
	private Name name;
	private Ssn ssn;
	private CurrentAddress currentAddress;
}