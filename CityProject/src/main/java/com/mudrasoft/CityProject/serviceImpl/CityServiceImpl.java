package com.mudrasoft.CityProject.serviceImpl;

import com.mudrasoft.CityProject.entity.City;
import com.mudrasoft.CityProject.service.CityService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CityServiceImpl implements CityService {

    ArrayList<City> set = new ArrayList<>();
    public City createCity(City city){
        set.add(city);
        return null;
    }
}
