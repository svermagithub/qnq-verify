package com.qnq.cis.model.request.payrolldata;

import lombok.Data;

@Data
public class IncomeSummaryItem{
	private double amount;
	private Period period;
	private String incomeType;
	private String sourcing;
	private String source;
}