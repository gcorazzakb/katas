import java.util.*;

public class Line {
    public static String WhoIsNext(String[] names, int n)
    {
        int inARow=0;
        int round=0;
        int step=1;
        while(step<=n){
            inARow=(int)Math.pow(2,round);
            step+=inARow*names.length;
            round++;
        }
        step-=inARow*names.length;
        int diff=n-step;

        return names[diff/inARow];
    }

}