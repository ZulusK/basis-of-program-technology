package zulus.extra;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class StringInPiFinderTest {
    @Test
    @Disabled

    public void emptyStringTest() {
        assertEquals(-1, StringInPiFinder.search(null));
    }

    @Test
    @Disabled
    public void matchAtStartOfPiTest() {
        assertEquals(0, StringInPiFinder.search("1"));
        assertEquals(0, StringInPiFinder.search("14"));
        assertEquals(0, StringInPiFinder.search("141"));
    }


    @Test
    @Disabled
    public void matchAtMiddleOfPiTest() {
        assertEquals(2398, StringInPiFinder.search("0601"));
    }
    @Test
    public void doNotMatchLetterTest() {
        assertEquals(-1, StringInPiFinder.search("A"));
    }
}
