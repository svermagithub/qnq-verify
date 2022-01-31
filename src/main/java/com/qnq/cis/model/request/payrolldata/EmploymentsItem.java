package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class EmploymentsItem{
	private String originalHireDate;
	private String workStatus;
	private List<String> derivedFields;
	private String endDate;
	private String jobTitle;
	private double payRate;
	private String payFrequency;
	private String employeeId;
	private List<Object> taxStatements;
	private String expectedHours;
	private List<PayStatementsItem> payStatements;
	private Employer employer;
	private String payInterval;
	private String department;
	private String currencyCode;
	private String startDate;
	private Expn expn;
}