package com.springboot.project.uber.uberApp.strategies;

import com.springboot.project.uber.uberApp.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDTO rideRequestDTO);
}
