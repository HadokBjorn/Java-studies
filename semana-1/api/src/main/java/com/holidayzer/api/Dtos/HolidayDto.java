package com.holidayzer.api.Dtos;

public class HolidayDto {
    private String date;
    private String name;

    public HolidayDto(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getDate(){
        return date;
    }
    public String getName(){
        return name;
    }
}
