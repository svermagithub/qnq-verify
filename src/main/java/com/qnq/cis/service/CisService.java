package com.qnq.cis.service;

import com.qnq.cis.mapper.CisArtReqMapper;
import com.qnq.cis.model.request.ArtRequest;
import com.qnq.cis.model.request.CisRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CisService {

    final
    CisArtReqMapper cisArtReqMapper;
    final private RestTemplate restTemplate = new RestTemplate();
    @Value("${art.service.url}")
    private String artUrl;

    public CisService(CisArtReqMapper cisArtReqMapper) {
        this.cisArtReqMapper = cisArtReqMapper;
    }

    public Map<String, String> getWidgetUrlAndTransactionId(CisRequest cisRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ArtRequest artRequest = cisArtReqMapper.sourceToDestination(cisRequest);
        HttpEntity<ArtRequest> artRequestHttpEntity = new HttpEntity<>(artRequest, headers);

        return (Map<String, String>) restTemplate.exchange(artUrl, HttpMethod.POST, artRequestHttpEntity, Map.class).getBody();
    }
}