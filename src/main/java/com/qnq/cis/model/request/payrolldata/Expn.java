package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class Expn{
	private List<IncomeSummaryItem> incomeSummary;
}