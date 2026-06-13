package com.cfs.Weather_API.dto;

import java.time.LocalDate;

public class DaysTemp {
    private LocalDate date;
    private Double minTemp;
    private Double maxTemp;
    private Double avgTemp;

    public DaysTemp() {
    }

    public DaysTemp(LocalDate date, Double minTemp, Double maxTemp, Double avgTemp) {
        this.date = date;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.avgTemp = avgTemp;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(Double avgTemp) {
        this.avgTemp = avgTemp;
    }
}
