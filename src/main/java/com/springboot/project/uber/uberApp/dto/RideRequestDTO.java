package com.springboot.project.uber.uberApp.dto;

import com.springboot.project.uber.uberApp.entities.enums.PaymentMethod;
import com.springboot.project.uber.uberApp.entities.enums.RideRequestStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDTO {
    private Long id;
    private PointDTO pickUpLocation;
    private PointDTO dropOffLocation;
    private PaymentMethod paymentMethod;
    private LocalDateTime requestedTime;
    private RiderDTO rider;
    private Double fare;
    private RideRequestStatus rideRequestStatus;
}
