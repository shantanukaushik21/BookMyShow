package com.bookMyShow.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Setter
@Getter
public class Booking extends BaseModel{
    private BookingStatus bookingStatus;
    private List<ShowSeat> showSeats;
    private Date bookedAt;
    private Show show;
    private int amount;
    private List<Payment> payments;
}
