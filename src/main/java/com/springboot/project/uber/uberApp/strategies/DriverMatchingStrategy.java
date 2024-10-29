package com.springboot.project.uber.uberApp.strategies;

import com.springboot.project.uber.uberApp.dto.RideRequestDTO;
import com.springboot.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO);
}
