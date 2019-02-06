public class DigPow {

    public static long digPow(int n, int p) {
        int series = numberSeries(n, p);
        return (series % n == 0) ? series / n : -1;
    }

    public static int numberSeries(int n, int p) {
        int result=0;
        char[] chars = String.valueOf(n).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Integer intAt = Integer.valueOf(String.valueOf(chars[i]));
            result+=Math.pow(intAt,p+i);
        }
        return result;
    }
}