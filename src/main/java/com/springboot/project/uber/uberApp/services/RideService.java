package com.springboot.project.uber.uberApp.services;

import com.springboot.project.uber.uberApp.dto.RideRequestDTO;
import com.springboot.project.uber.uberApp.entities.Driver;
import com.springboot.project.uber.uberApp.entities.Ride;
import com.springboot.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDTO rideRequestDTO);

    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Driver> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
