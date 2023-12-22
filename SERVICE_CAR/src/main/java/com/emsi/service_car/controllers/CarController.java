package com.emsi.service_car.controllers;


import com.emsi.service_car.models.CarResponse;
import com.emsi.service_car.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.CacheResponse;
import java.util.List;

@RestController
@RequestMapping("api/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<CarResponse> findAll(){
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public  CarResponse findById(@PathVariable Long id) throws Exception{
        return carService.findById(id);
    }
}
