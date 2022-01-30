package com.qnq.cis.service;

import com.qnq.cis.entity.PayRollData;
import com.qnq.cis.repository.PayRollDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    PayRollDataRepository payRollDataRepository;

    @KafkaListener(topics = "CISTopic")
    public void getMessage(String message) {
        PayRollData payRollData = new PayRollData();
        //TODO : Implement mapper Code
        payRollDataRepository.save(payRollData);
    }
}
