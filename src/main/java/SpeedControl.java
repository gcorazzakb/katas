public class SpeedControl {
    public static long gps(int i, double[] x) {
        return -1;
    }

    public static double[] getDeltas(double[] data) {
        double[] deltas = new double[data.length-1];
        for (int i = 0; i < data.length-1; i++) {
            deltas[i] = Math.abs(data[i] - data[i+1]);
        }
        return deltas;
    }

    public static double calculateSpeedFromDelat(double delta, double seconds) {
        return (3600*delta)/seconds;
    }

    public static double getMaximumFromArray(double[] data) {
    }
}
