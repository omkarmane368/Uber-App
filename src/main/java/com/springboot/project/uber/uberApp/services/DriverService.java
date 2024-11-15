package com.springboot.project.uber.uberApp.services;

import com.springboot.project.uber.uberApp.dto.DriverDTO;
import com.springboot.project.uber.uberApp.dto.RideDTO;
import com.springboot.project.uber.uberApp.dto.RiderDTO;
import com.springboot.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverService {
    RideDTO acceptRide(Long rideId);

    RideDTO cancelRide(Long rideId);

    RideDTO startRide(Long rideId, String otp);

    RideDTO endRide(Long rideId);

    RiderDTO rateRider(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();

    Driver getCurrentDriver();
}
