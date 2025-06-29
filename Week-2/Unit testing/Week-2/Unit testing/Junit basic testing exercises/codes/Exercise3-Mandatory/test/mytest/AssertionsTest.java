package mytest;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals("Values are not equal", 5, 2 + 3);
        assertTrue("Expected condition to be true", 5 > 3);
        assertFalse("Expected condition to be false", 2 > 10);
        assertNull("Expected null", null);
        assertNotNull("Expected not null", "JUnit is great!");
    }
}
