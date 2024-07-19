
enum Weekdays {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY,INVALID
}

public class GetWeekday {

    public static void main(String[] args) {

        System.out.println(getWeekday(5));
        System.out.println(getWeekday(6));
     
    }
    static String getWeekday(int dayNumber){
        Weekdays[] day = Weekdays.values();
        return day[dayNumber-1].name().toLowerCase();
    } 

    static Weekdays getWeekday2(int dayNumber){
        Weekdays day;
        switch (dayNumber) {
            case 1:
            day = Weekdays.MONDAY;
                break;
            case 2:
            day = Weekdays.TUESDAY;
                break;
            case 3:
            day = Weekdays.WEDNESDAY;
                break;
            case 4:
            day = Weekdays.THURSDAY;
                break;
            case 5:
            day = Weekdays.FRIDAY;
                break;
            case 6:
            day = Weekdays.SATURDAY;
                break;
            case 7:
            day = Weekdays.SUNDAY;
                break;
            default:
            day = Weekdays.INVALID;
        }
        return day;
    } 
}
