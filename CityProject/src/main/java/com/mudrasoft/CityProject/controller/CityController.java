package com.mudrasoft.CityProject.controller;

import com.mudrasoft.CityProject.entity.City;
import com.mudrasoft.CityProject.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping("/create/city")
    public ResponseEntity<City> createCity(@RequestBody City city){
        City cit = cityService.createCity(city);
        return new ResponseEntity<City>(cit,HttpStatus.CREATED);
    }
}
