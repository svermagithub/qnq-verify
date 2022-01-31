package com.qnq.cis.service;

import com.qnq.cis.repository.PayRollDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

@Service
public class KafkaConsumer {

    @Autowired
    PayRollDataRepository payRollDataRepository;

    @KafkaListener(topics = "CISTopic")
    public void getMessage(Json payRollDataRequestJson) {
        payRollDataRepository.save(payRollDataRequestJson);
    }
}
