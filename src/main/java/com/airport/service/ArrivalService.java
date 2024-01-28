package com.airport.service;

import com.airport.dto.ArrivalDTO;
import com.airport.enums.Status;

import java.util.List;

public interface ArrivalService {

    ArrivalDTO findById(Long id);
    void delete(Long id);
    void updateStatus(ArrivalDTO arrival);
    void save(ArrivalDTO dto);
    void update(ArrivalDTO dto);
    List<ArrivalDTO> listAllArrivalsByStatus(Status status);


}
