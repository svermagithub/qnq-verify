package com.qnq.cis.model.request.payrolldata;

import java.util.List;
import lombok.Data;

@Data
public class PayRollDataRequest{
	private EndUserDataset endUserDataset;
	private List<PassthruTODOItem> passthruTODO;
	private String dataProviderPid;
	private String connectorDataProviderPid;
	private String endUserPid;
}