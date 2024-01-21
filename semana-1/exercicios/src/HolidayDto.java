public class HolidayDto {
    private String date;
    private String name;

    HolidayDto(String date, String name) {
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
