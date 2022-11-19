import java.util.Arrays;
import java.util.List;

public class Date {
    int day;
    int month;
    int year;
    int last_day;
    int last_month=12;

    public Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;

    }

    public void nextDate()
    {
        if(day == last_day){
            day = 0;
            if(month == last_month){
                month = 1;
                year++;
            }
            else {
                month++;
            }
        }
        day++;
    }


}
