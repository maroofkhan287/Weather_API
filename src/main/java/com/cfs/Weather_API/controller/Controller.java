package com.cfs.Weather_API.controller;

import com.cfs.Weather_API.dto.RootClass;
// import com.cfs.Weather_API.dto.WeatherResponse;
import com.cfs.Weather_API.service.WeatherService;
// import org.apache.tomcat.util.http.WebdavIfHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class Controller {

    @Autowired
    private WeatherService service;

    @GetMapping("/test/{city}")
    public String getWeatherData(@PathVariable String city){
        return service.test();
    }

    @GetMapping("/my/{city}")
    public RootClass getWeather(@PathVariable String city){
        System.out.println("called");
        return service.getData(city);
    }

}
