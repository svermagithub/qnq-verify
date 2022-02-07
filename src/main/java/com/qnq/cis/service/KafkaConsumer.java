package com.qnq.cis.service;

import com.qnq.cis.repository.PayRollDataRepository;
import io.swagger.v3.core.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    private PayRollDataRepository payRollDataRepository;

    @KafkaListener(topics = "CISTopic")
    public void getMessage(Json payRollDataRequestJson) {
        payRollDataRepository.save(payRollDataRequestJson);
    }
}
