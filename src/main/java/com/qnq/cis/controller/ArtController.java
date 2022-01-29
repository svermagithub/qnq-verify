package com.qnq.cis.controller;

import com.qnq.cis.model.request.ArtRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/art")
public class ArtController {

    @PostMapping("/getWidgetUrlAndTransactionId")
    public Map<String,String> getWidgetUrlAndTransactionId(@RequestBody ArtRequest artRequest) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("widgetURL","https:\\art.com");
        map.put("cisTransactionId","art123456");
        return map;
    }



}
