package com.qnq.cis.model.request.payrolldata;

import lombok.Data;

@Data
public class DepositAccount{
	private String accountType;
	private String accountNumberDisplay;
	private String accountNumber;
	private String routingTransitNumber;
}