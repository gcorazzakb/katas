import org.junit.Test;

import static org.junit.Assert.*;

public class CycleTest {
    private static void dotest(int n, int expected) {
        int actual = Cycle.cycle(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        dotest(11, 2);
        dotest(18118, -1);
        dotest(69, 22);
        dotest(197, 98);
        dotest(65, -1);
    }

    @Test
    public void testIsCoPrimeTo10() {
        assertTrue(Cycle.isCoPrimeTo10(9));
        assertFalse(Cycle.isCoPrimeTo10(8));
        assertFalse(Cycle.isCoPrimeTo10(342555));
    }


}
