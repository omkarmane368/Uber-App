package com.springboot.project.uber.uberApp.services;

import com.springboot.project.uber.uberApp.dto.DriverDTO;
import com.springboot.project.uber.uberApp.dto.RideDTO;
import com.springboot.project.uber.uberApp.dto.RideRequestDTO;
import com.springboot.project.uber.uberApp.dto.RiderDTO;

import java.util.List;

public interface RiderService {
    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}