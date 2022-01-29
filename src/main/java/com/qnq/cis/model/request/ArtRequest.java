package com.qnq.cis.model.request;

import lombok.Data;

@Data
public class ArtRequest {
    private Address address;
    private String applicationEndUserId;
    private String dob;
    private String email;
    private String generationCode;
    private Name fullName;
    private String phone;
    private String ssn;
}
