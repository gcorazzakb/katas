public class Xbonacci {

    public double[] tribonacci(double[] startSeq, int n) {
        double[] seq= new double[n];
        for (int i = 0; i < 3  && i <seq.length; i++) {
            seq[i]=startSeq[i];
        }

        for (int i = 3; i < seq.length; i++) {
            double sum=sumArray(i-3,i, seq);
            seq[i]=sum;
        }
        return seq;
    }

    private double sumArray(int from, int to, double[] seq) {
        double sum=0;
        for (int i = from; i < to; i++) {
            sum+=seq[i];
        }
        return sum;
    }
}