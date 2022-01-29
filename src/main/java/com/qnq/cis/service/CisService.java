package com.qnq.cis.service;

import com.qnq.cis.mapper.IMapper;
import com.qnq.cis.model.request.ArtRequest;
import com.qnq.cis.model.request.CisRequest;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CisService {

    final private RestTemplate restTemplate = new RestTemplate();

    final private IMapper mapper = Mappers.getMapper(IMapper.class);

    @Value("${art.service.url}")
    private String artUrl;

    public Map<String, String> getWidgetUrlAndTransactionId(CisRequest cisRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ArtRequest artRequest = mapper.sourceToDestination(cisRequest);
        HttpEntity<ArtRequest> artRequestHttpEntity = new HttpEntity<>(artRequest, headers);
        ResponseEntity<Map> artResponseResponseEntity = restTemplate.exchange(artUrl, HttpMethod.POST, artRequestHttpEntity, Map.class);

        return (Map<String, String>) artResponseResponseEntity.getBody();
    }
}
