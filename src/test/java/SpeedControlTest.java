import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedControlTest {

    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void it_Should_return_the_Differences_between_gpsData(){
        double[] data= {0,0.3,0.9};
        double[] expect= {0.3, 0.6};
        double[] retDeltas= SpeedControl.getDeltas(data);
        assertArrayEquals(retDeltas, expect, 0.0001);
    }
    @Test
    public void it_Should_return_the_Differences_between_two_gpsData(){
        double[] data= {0,5};
        double[] expect= {5};
        double[] retDeltas= SpeedControl.getDeltas(data);
        assertArrayEquals(retDeltas, expect);
    }

    @Test
    public void itShouldCalculateSpeedFromDelta(){
        double delta= 0.19;
        double seconds = 15;
        double speed=SpeedControl.calculateSpeedFromDelat(delta,seconds);
        assertEquals(speed,45.6d,0.00001);
    }

    @Test
    public void itShouldreturnMaximumFromArray(){
        double[] data= {0,0.3,0.9};
        double max=SpeedControl.getMaximumFromArray(data);
        assertEquals(max,0.9d);

    }


//    @Test
//    @Ignore
//    public void test1() {
//        System.out.println("Fixed Tests: gps");
//        double[] x = new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
//        testing(SpeedControl.gps(20, x), 41);
//        x = new double[] {0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25};
//        testing(SpeedControl.gps(12, x), 219);
//        x = new double[] {0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84};
//        testing(SpeedControl.gps(20, x), 80);
//    }
}