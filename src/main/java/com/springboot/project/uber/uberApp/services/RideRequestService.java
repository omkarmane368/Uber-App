package com.springboot.project.uber.uberApp.services;

import com.springboot.project.uber.uberApp.entities.RideRequest;

public interface RideRequestService {
    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
