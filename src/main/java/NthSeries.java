public class NthSeries {

    public static String seriesSum(int n) {
        double sum=0;
        for (int i = 0; i < n; i++) {
             sum+=1f/(1+i*3);
        }
        String retString = String.valueOf((float) (Math.round(sum * 100)) / 100);
        if (retString.matches(".\\.\\d")){
            retString+="0";
        }
        return retString;
    }
}