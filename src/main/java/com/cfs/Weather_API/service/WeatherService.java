package com.cfs.Weather_API.service;

import com.cfs.Weather_API.dto.DaysTemp;
import com.cfs.Weather_API.dto.WeatherForecast;
import com.cfs.Weather_API.dto.RootClass;
import com.cfs.Weather_API.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    public String test(){
        return "good ";
    }

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiurl;

    private final RestTemplate template= new RestTemplate(); // use to consume api within the beckend from one beckend to another

    public WeatherResponse getData(String city){
        String url= apiurl + "?key=" + apiKey + "&q=" + city;
        System.out.println("url");
        RootClass response= template.getForObject(url,RootClass.class);
        WeatherResponse weatherRes=new WeatherResponse();

        weatherRes.setCity(response.getLocation().getName());
        weatherRes.setRegion(response.getLocation().getRegion());
        weatherRes.setCountry(response.getLocation().getCountry());
        weatherRes.setCondition(response.getCurrent().getCondition().getText());
        weatherRes.setTemparature(String.valueOf(response.getCurrent().getTempC()));

        return weatherRes;

    }

    public WeatherForecast getForeCast(String city, int days){
        WeatherForecast weatherForecast=new WeatherForecast();
        WeatherResponse res=getData(city);
        WeatherForecast response= new WeatherForecast();
        response.setWeatherRes(res);
    }

}
