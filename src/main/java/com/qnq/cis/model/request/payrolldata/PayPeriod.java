package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class PayPeriod{
	private Earnings earnings;
	private String endDate;
	private List<DeductionsItem> deductions;
	private String startDate;
}