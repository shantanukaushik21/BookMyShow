package com.bookMyShow.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;
    private ShowSeat showSeat;
}
