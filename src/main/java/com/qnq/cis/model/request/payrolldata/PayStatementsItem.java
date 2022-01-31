package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class PayStatementsItem{
	private int netPay;
	private YearToDate yearToDate;
	private PayPeriod payPeriod;
	private int grossPay;
	private double payRate;
	private String payInterval;
	private String fileAddress;
	private String currencyCode;
	private int payIntervalValue;
	private List<PayDistributionsItem> payDistributions;
	private String payDate;
}