package com.springboot.project.uber.uberApp.strategies.impl;

import com.springboot.project.uber.uberApp.dto.RideRequestDTO;
import com.springboot.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
