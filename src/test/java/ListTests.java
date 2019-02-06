import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class ListTests {
    @Test
    public void it_should_return_first_person_in_queue() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 1;
        assertEquals("Sheldon", new Line().WhoIsNext(names, n));
    }
    @Test
    public void test2() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 16;
        assertEquals("Sheldon", new Line().WhoIsNext(names, n));
    }
}