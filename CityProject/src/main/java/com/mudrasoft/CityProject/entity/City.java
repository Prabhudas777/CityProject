package com.mudrasoft.CityProject.entity;

import lombok.Data;

@Data
public class City {

    private String cityName;
    private Long population;
    private String country;
    private String latitude;
    private String longitude;
}
