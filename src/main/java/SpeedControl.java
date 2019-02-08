class SpeedControl {

    public static long gps(int seconds, double[] locations) {
        double[] deltas = getDeltas(locations);
        double[] speeds= new double[deltas.length];
        for (int i = 0; i < deltas.length; i++) {
            double delta = deltas[i];
            speeds[i]=calculateSpeedFromDelta(delta,seconds);
        }

        return (long) Math.floor(getMaximumFromArray(speeds));
    }

    public static double[] getDeltas(double[] data) {
        if (data.length==0){
            return new double[0];
        }
        double[] deltas = new double[data.length-1];
        for (int i = 0; i < data.length-1; i++) {
            deltas[i] = Math.abs(data[i] - data[i+1]);
        }
        return deltas;
    }

    public static double calculateSpeedFromDelta(double delta, double seconds) {
        return (3600*delta)/seconds;
    }

    public static double getMaximumFromArray(double[] data) {
        double max=Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            double datum = data[i];
            max=Math.max(max,datum);
        }
        return max;
    }
}
