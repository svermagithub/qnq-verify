package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class EndUserDataset{
	private List<EmploymentsItem> employments;
	private Employee employee;
	private Expn expn;
}