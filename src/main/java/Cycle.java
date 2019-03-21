import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Cycle {

    public static int cycle(int n) {
        if (isCoPrimeTo10(n)) {
            return findCycle(n);
        }
        return -1;
    }

    private static int findCycle(int n) {
        Map<Integer,Integer> divs = new HashMap<>();
        int div = (int) Math.pow(10,(int) (Math.log10(n) + 1));
        int i=0;
        while (div != 0) {
            divs.put(div,i);
            div -= ((div / n) * n);
            div*=10;
            Integer index = divs.get(div);
            if (index !=null){
                return divs.size()-index;
            }
        }

        return -1;
    }


    public static boolean isCoPrimeTo10(int co) {
        return (co % 2) * (co % 5) != 0;
    }
}
