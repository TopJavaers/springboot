package com.example.demo.controller;

import com.example.demo.beans.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/car")
public class CarController {
    @RequestMapping(value="/getCar/{brand}")
    public Car getCar(@PathVariable("brand") String brand,double price){
        Car car = new Car();
        car.setBrand(brand);
        car.setPrice(price);
        car.setDate(new Date());
        return  car;
    }
}
