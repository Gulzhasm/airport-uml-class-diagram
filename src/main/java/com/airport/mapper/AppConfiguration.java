package com.airport.mapper;

import com.airport.entity.Arrival;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public DepartureMapper departureMapper(){
        return new DepartureMapper(modelMapper());
    }
    @Bean
    public ArrivalMapper arrivalMapper(){
        return new ArrivalMapper(modelMapper());
    }
}
