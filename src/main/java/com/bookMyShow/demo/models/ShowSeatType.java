package com.bookMyShow.demo.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ShowSeatType extends BaseModel{
    private Show show;
    private SeatType seatType;
    private int price;
}
