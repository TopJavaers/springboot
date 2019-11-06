package com.example.demo.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String brand;
    private double price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
}
