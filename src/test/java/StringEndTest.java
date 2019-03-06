import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class StringEndTest {
    @Test
    public void testExpectedEndsWithTed() {
        assertTrue(StringEnd.solution("expected", "ted"));
    }

    @Test
    public void testHalloEndsWithGutenTag() {
        assertFalse(StringEnd.solution("Hallo", "Guten Tag"));
    }
}
