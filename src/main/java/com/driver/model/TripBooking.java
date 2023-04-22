package com.driver.model;
import com.driver.model.TripStatus;

import javax.persistence.*;

@Entity
@Table(name = "trip_booking")
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private String fromLocation;
    private String toLocation;
    private int distanceInKm;
    @Enumerated(EnumType.STRING)
    TripStatus tripStatus;

    private int bill;

}