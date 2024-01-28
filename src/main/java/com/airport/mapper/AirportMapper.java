package com.airport.mapper;

import com.airport.dto.AirportDTO;
import com.airport.entity.Airport;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AirportMapper {

    private final ModelMapper modelMapper;

    public AirportMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Airport convertToEntity(AirportDTO dto) {
        return modelMapper.map(dto, Airport.class);

    }

    public AirportDTO convertToDto(Airport entity) {
        return modelMapper.map(entity, AirportDTO.class);
    }
}
