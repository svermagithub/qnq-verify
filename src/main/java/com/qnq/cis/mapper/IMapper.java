package com.qnq.cis.mapper;

import com.qnq.cis.model.request.ArtRequest;
import com.qnq.cis.model.request.CisRequest;
import org.mapstruct.Mapper;

@Mapper
public interface IMapper {
    ArtRequest sourceToDestination(CisRequest source);
    CisRequest destinationToSource(ArtRequest destination);
}
