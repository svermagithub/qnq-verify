package com.qnq.cis.model.request;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String state;
    private String street1;
    private String street2;
    private String zip;
}
