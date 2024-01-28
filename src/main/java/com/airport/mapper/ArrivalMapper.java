package com.airport.mapper;

import com.airport.dto.ArrivalDTO;
import com.airport.entity.Arrival;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ArrivalMapper {
    private final ModelMapper modelMapper;

    public ArrivalMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convertToEntity
    public Arrival convertToEntity(ArrivalDTO dto) {
        return modelMapper.map(dto, Arrival.class);
    }

    //convertToDto
    public ArrivalDTO convertToDto(Arrival entity) {
        return modelMapper.map(entity, ArrivalDTO.class);
    }
}
