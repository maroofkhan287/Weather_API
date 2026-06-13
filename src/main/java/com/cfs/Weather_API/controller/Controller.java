package com.cfs.Weather_API.controller;

import com.cfs.Weather_API.dto.WeatherForecast;
// import com.cfs.Weather_API.dto.WeatherResponse;
import com.cfs.Weather_API.dto.WeatherResponse;
import com.cfs.Weather_API.service.WeatherService;
// import org.apache.tomcat.util.http.WebdavIfHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class Controller {

    @Autowired
    private WeatherService service;

    @GetMapping("/test/{city}")
    public String getWeatherData(@PathVariable String city) {
        return service.test();
    }

    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city){
        System.out.println("called");
        return service.getData(city);
    }

    @GetMapping("/forecast/{city}")
    public WeatherForecast getForecast(@RequestParam String city, @RequestParam int days){
        return service.getForeCast(city, days);
    }

}
