import org.testng.Assert;
import org.testng.annotations.Test;

public class CalenderTest {
   @Test
   public void DayTest()
   {
      Calendar calendar= new Calendar(4,5,2000);
      String exp="5/5/2000";
      Assert.assertEquals(calendar.getNextDate(),exp);
   }
   @Test
   public void MonthTest()
   {
      Calendar calendar= new Calendar(31,3,2020);
      String exp="1/4/2020";
      Assert.assertEquals(calendar.getNextDate(),exp);
   }

   @Test
   public void YearTest()
   {
      Calendar calendar= new Calendar(31,12,2019);
      String exp="1/1/2020";
      Assert.assertEquals(calendar.getNextDate(),exp);
   }

   @Test
   public void LeapYearTest()
   {
      Calendar calendar= new Calendar(28,2,2016);
      String exp="29/2/2016";
      Assert.assertEquals(calendar.getNextDate(),exp);
   }

   @Test
   public void NotLeapYearTest()
   {
      Calendar calendar= new Calendar(28,2,2018);
      String exp="1/3/2018";
      Assert.assertEquals(calendar.getNextDate(),exp);
   }
}
