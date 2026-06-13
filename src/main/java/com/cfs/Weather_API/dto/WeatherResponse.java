package com.cfs.Weather_API.dto;

public class WeatherResponse {
    private String city;
    private String region;
    private String country;
    private String temparature;
    private String condition;


    public WeatherResponse() {
    }

    public WeatherResponse(String condition, String country, String region, String temparature, String city) {
        this.condition = condition;
        this.temparature = temparature;
        this.city = city;
        this.country=country;
        this.region=region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTemparature() {
        return temparature;
    }

    public void setTemparature(String temparature) {
        this.temparature = temparature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
