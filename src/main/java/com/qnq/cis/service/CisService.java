package com.qnq.cis.service;

import com.qnq.cis.model.request.CisRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CisService {

    @Autowired
    RestTemplate restTemplate;


    public Map<String,String> getWidgetUrlAndTransactionId(CisRequest cisRequest) {

      //  restTemplate.exchange("",)
        return null;
    }
}
