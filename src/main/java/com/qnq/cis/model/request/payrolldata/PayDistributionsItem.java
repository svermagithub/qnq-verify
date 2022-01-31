package com.qnq.cis.model.request.payrolldata;

import lombok.Data;

@Data
public class PayDistributionsItem{
	private DepositAccount depositAccount;
	private DepositTransaction depositTransaction;
}