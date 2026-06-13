package com.cfs.Weather_API.dto;

import java.util.List;

public class WeatherForecast {
    private WeatherResponse weatherRes;
    private List<DaysTemp> daysTemp;

    public WeatherForecast() {
    }

    public WeatherForecast(WeatherResponse weatherRes, List<DaysTemp> daysTemp) {
        this.weatherRes = weatherRes;
        this.daysTemp = daysTemp;
    }

    public WeatherResponse getWeatherRes() {
        return weatherRes;
    }

    public void setWeatherRes(WeatherResponse weatherRes) {
        this.weatherRes = weatherRes;
    }

    public List<DaysTemp> getDaysTemp() {
        return daysTemp;
    }

    public void setDaysTemp(List<DaysTemp> daysTemp) {
        this.daysTemp = daysTemp;
    }
}
