package com.holidayzer.api.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.holidayzer.api.Dtos.HolidayDto;

@RestController
@RequestMapping("/holidays")
public class HolidayController {
    private HolidayDto[] holidays = {
        new HolidayDto("01-01-2024","Confraternização Mundial"),
        new HolidayDto("12-02-2024","Carnaval"),
        new HolidayDto("13-02-2024","Carnaval"),
        new HolidayDto("29-03-2024","Sexta-feira Santa"),
        new HolidayDto("21-04-2024","Tiradentes"),
        new HolidayDto("01-05-2024","Dia do Trabalho"),
        new HolidayDto("30-05-2024","Corpus Christi"),
        new HolidayDto("07-09-2024", "Independência do Brasil"),
        new HolidayDto("12-10-2024","Nossa Senhora Aparecida"),
        new HolidayDto("02-11-2024","Finados"),
        new HolidayDto("15-11-2024","Proclamação da República"),
        new HolidayDto("20-11-2024","Dia Nacional de Zumbi e da Consciência Negra"),
        new HolidayDto("25-12-2024","Natal"),
    };
    @GetMapping
    String findAll(){
        //for( HolidayDto holiday : holidays){
        //    System.out.println( holiday.getDate()+" - "+holiday.getName());
        //}
        Gson gson = new Gson();
        String json = gson.toJson(holidays);
        System.out.println(json);
        return json;
    }
    @GetMapping("/{date}")
    String findOne(@PathVariable("date") String date){
        boolean existDate = false;
        String whatHoliday = "";
        for (HolidayDto holiday:holidays){
            if(holiday.getDate().equals(date)){
                existDate = true;
                whatHoliday = holiday.getName();
                break;
            }else{
                existDate = false;
            }
            
        }
        if(existDate){
            return ( "Dia "+date+" é "+ whatHoliday);
        }else{
            return( "Dia "+date+" não é feriado 🥲");
        }
    }

}