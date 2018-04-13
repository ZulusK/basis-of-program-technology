package zulus.extra;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class StringInPiFinderTest {
    @Test
    public void emptyStringTest() {
        assertEquals(-1, StringInPiFinder.search(null,0));
    }

    @Test
    public void matchAtStartOfPiTest() {
        assertEquals(0, StringInPiFinder.search("1",0));
        assertEquals(0, StringInPiFinder.search("14",0));
        assertEquals(0, StringInPiFinder.search("141",0));
    }


    @Test
    @Disabled
    public void matchAtMiddleOfPiTest() {
        assertEquals(2398, StringInPiFinder.search("0601",0));
    }
    @Test
    public void doNotMatchLetterTest() {
        assertEquals(-1, StringInPiFinder.search("A",100));
    }
}
