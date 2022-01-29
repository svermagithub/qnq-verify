package com.qnq.cis.model.request;

import lombok.Data;

@Data
public class CisRequest {
    private String reportType;
    private ReportCustomLabels reportCustomLabels;
    private ResellerInfo resellerInfo;
    private CustomOptions customOptions;
    private VendorData vendorData;
    private Consumerpii consumerpii;
    private PermissiblePurpose permissiblePurpose;
    private Requestor requestor;
}
