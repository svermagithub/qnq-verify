package com.qnq.cis.mapper;

import com.qnq.cis.model.request.ArtRequest;
import com.qnq.cis.model.request.CisRequest;
import com.qnq.cis.model.request.Destination;
import com.qnq.cis.model.request.Source;
import org.mapstruct.Mapper;

@Mapper
public interface ITestMapper {
    Destination sourceToDestination(Source source);
    Source destinationToSource(Destination destination);
}
