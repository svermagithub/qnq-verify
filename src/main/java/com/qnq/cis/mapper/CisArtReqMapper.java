package com.qnq.cis.mapper;

import com.qnq.cis.model.request.*;
import org.springframework.stereotype.Component;

@Component
public class CisArtReqMapper {


    public ArtRequest sourceToDestination(CisRequest cisRequest) {
        ApplicantInformation applicantInformation = cisRequest.getConsumerpii().getApplicantInformation();
        CurrentAddress currentAddress = applicantInformation.getCurrentAddress();

        ArtRequest artRequest = new ArtRequest();
        //Set Address
        artRequest.setAddress(new Address());

        artRequest.getAddress().setStreet1(currentAddress.getLine1());
        //TODO : Concatenated CurrentAddress.line2 and CurrentAddress.line3 for Address.street2 to avoid data loss
        artRequest.getAddress().setStreet2(currentAddress.getLine2() + " " +currentAddress.getLine3());
        artRequest.getAddress().setCity(currentAddress.getCity());
        artRequest.getAddress().setState(currentAddress.getState());
        artRequest.getAddress().setZip(currentAddress.getZipCode());

        artRequest.setDob(applicantInformation.getDob().getDob());
        //TODO : No mapping found for email ID
//        artRequest.setEmail();
        artRequest.setFullName(applicantInformation.getName());
        //TODO :Considering first phone number of CIS request Phone list
        artRequest.setPhone(applicantInformation.getPhone().get(0).getNumber());
        //TODO : What is the mapping of ART ApplicationEndUserId in CIS Request
//        artRequest.setApplicationEndUserId();
        //TODO : Please verify the mapping of GenerationCode
        artRequest.setGenerationCode(applicantInformation.getName().getGenerationCode());
        artRequest.setSsn(applicantInformation.getSsn().getSsn());

        return artRequest;
    }
}
