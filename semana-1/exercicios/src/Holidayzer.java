public class Holidayzer {
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

    void isHoliday(String date){
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
            System.out.println( "Dia "+date+" é "+ whatHoliday);
        }else{
            System.out.println( "Dia "+date+" não é feriado 🥲");
        }
    }

    void allHolidays(){
        for( HolidayDto holiday : holidays){
            System.out.println( holiday.getDate()+" - "+holiday.getName());
        }
    }
}
