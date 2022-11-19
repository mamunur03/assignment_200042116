import java.util.Arrays;
import java.util.List;

public class Calendar {
    List<Integer> Months30Days = Arrays.asList(4,6,9,11);
    List<Integer> Months31Days = Arrays.asList(1,3,5,7,8,10,12);

    Date date;
    public Calendar(int day,int month,int year)
    {
        if(Months30Days.contains(month)){
            this.date= new lastDay30(day,month,year);
        }
        else if (Months31Days.contains(month)) {
            this.date= new lastDay31(day,month,year);
        }
        else {
            this.date=new February(day,month,year);
        }

    }

    public String getNextDate(){
        date.nextDate();
        String result=date.day+"/"+ date.month+"/"+ date.year;
        return result;
    }
}
