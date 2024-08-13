package com.bookMyShow.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.PropertyResourceBundle;

@Getter
@Setter
public class Payment extends BaseModel{
    private String refNo;
    private int amount;
    private PaymentProvider paymentProvider;
    private PaymentStatus paymentStatus;

}
