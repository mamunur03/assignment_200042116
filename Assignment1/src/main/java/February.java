public class February extends Date{
    Year checkYear=new Year();
    public February(int day, int month, int year) {
        super(day, month, year);
        if (checkYear.isLeapYear(year)) {
            last_day=29;
        } else {
            last_day=28;
        }
    }
}
