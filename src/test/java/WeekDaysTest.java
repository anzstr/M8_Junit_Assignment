import WeekDaysPackage.WeekDays;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class WeekDaysTest {
    @Test
    public void checkValidDays() {
        WeekDays weekDays = new WeekDays();
        String weekday = weekDays.getDay(1);
        assertEquals("Sunday", weekday);
        weekday = weekDays.getDay(5);
        assertEquals("Thursday", weekday);
        weekday = weekDays.getDay(7);
        assertEquals("Saturday", weekday);
    }

    @Test
    public void checkInvalidDays(){
        WeekDays weekDays = new WeekDays();
        String weekday = weekDays.getDay(-1);
        assertEquals("The number should be equal or larger than 1", weekday);
        weekday = weekDays.getDay(50);
        assertEquals("The number should be equal or smaller than 7", weekday);
    }
    @Test
    public void checkNullDay (){
        WeekDays weekDays = new WeekDays();
        assertThrows(NullPointerException.class, () -> {  weekDays.getDay(null); });
    }
}
