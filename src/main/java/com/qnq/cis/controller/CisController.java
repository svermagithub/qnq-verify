package com.qnq.cis.controller;

import com.qnq.cis.model.request.CisRequest;
import com.qnq.cis.service.CisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cis")
public class CisController {

    @Autowired
    CisService cisService;

    @GetMapping("/getWidget")
    public Map<String,String> getWidgetUrlAndTransactionId(@RequestBody CisRequest cisRequest) {

        cisService.getWidgetUrlAndTransactionId(cisRequest);

        return null;
    }


}
