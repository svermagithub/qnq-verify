package com.qnq.cis.model.request.payrolldata;

import lombok.Data;

@Data
public class DeductionsItem{
	private int amount;
	private String code;
	private String name;
	private String tax;
	private String category;
}