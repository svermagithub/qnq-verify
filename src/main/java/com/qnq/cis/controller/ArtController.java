package com.qnq.cis.controller;

import com.qnq.cis.model.request.ArtRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/art")
public class ArtController {

    public Map<String,String> getWidgetUrlAndTransactionId(@RequestBody ArtRequest artRequest) {

        return null;
    }



}
