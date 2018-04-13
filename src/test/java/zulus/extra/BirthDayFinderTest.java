package zulus.extra;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BirthDayFinderTest {
    @Test
    public void emptyBirthdayTest() {
        assertEquals(-1, BirthDayFinder.findBirthDay(null));
        assertEquals(-1, BirthDayFinder.findBirthDay(""));
    }

    @Test
    public void matchAtStartOfPiBirthdayTest() {
        assertEquals(0, BirthDayFinder.findBirthDay("2"));
        assertEquals(0, BirthDayFinder.findBirthDay("24"));
        assertEquals(0, BirthDayFinder.findBirthDay("243"));
    }

    @Test
    public void notANumberInInputBirthdayTest() {
        assertEquals(-1, BirthDayFinder.findBirthDay("A"));
        assertEquals(-1, BirthDayFinder.findBirthDay("."));
        assertEquals(-1, BirthDayFinder.findBirthDay("A123"));
        assertEquals(-1, BirthDayFinder.findBirthDay("1A23"));
        assertEquals(-1, BirthDayFinder.findBirthDay("123A"));
    }

    @Test
    public void matchAtMiddleOfPiBirthdayTest() {
        assertEquals(6, BirthDayFinder.findBirthDay("888"));
        assertEquals(24, BirthDayFinder.findBirthDay("03707344"));
    }
}
