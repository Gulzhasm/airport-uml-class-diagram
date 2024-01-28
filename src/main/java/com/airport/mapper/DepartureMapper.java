package com.airport.mapper;

import com.airport.dto.ArrivalDTO;
import com.airport.dto.DepartureDTO;
import com.airport.entity.Departure;
import org.modelmapper.ModelMapper;

public class DepartureMapper {
    private final ModelMapper modelMapper;

    public DepartureMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convertToEntity
    public Departure convertToEntity(DepartureDTO dto){

        return modelMapper.map(dto,Departure.class);
    }

    //convertToDto
    public DepartureDTO convertToDto(Departure entity){

        return modelMapper.map(entity,DepartureDTO.class);
    }
}
