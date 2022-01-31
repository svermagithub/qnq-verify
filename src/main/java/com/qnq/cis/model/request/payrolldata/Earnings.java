package com.qnq.cis.model.request.payrolldata;

import lombok.Data;

@Data
public class Earnings{
	private int commissionPay;
	private int otherPay;
	private int basePay;
	private int bonusPay;
	private int overtimePay;
}