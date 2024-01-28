package com.airport.service;


import com.airport.dto.DepartureDTO;
import com.airport.enums.Status;

import java.util.List;

public interface DepartureService {
    DepartureDTO findById(Long id);
    void delete(Long id);
    void updateStatus(DepartureDTO arrival);
    void save(DepartureDTO dto);
    void update(DepartureDTO dto);
    List<DepartureDTO> listAllDeparturesByStatus(Status status);
}
