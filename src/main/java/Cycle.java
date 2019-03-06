import java.math.BigDecimal;

class Cycle {

    private static int roundTo=1000;

    public static int cycle(int n) {
        if (isCoPrimeTo10(n)){
            String fraction=new BigDecimal(1).divide(new BigDecimal(n),roundTo, 0).toString().replaceAll("\\d*\\.","");
            System.out.println(fraction);
            for (int i = 1; i < roundTo; i++) {
                String regex="("+fraction.substring(0,i)+"){5}.*";
                if(fraction.matches(regex)){
                    return i;
                }
            }
        }else{
            return -1;
        }
        return -1;
    }

    public static boolean isCoPrimeTo10(int co) {
        for (int i = 2; i < 10; i++) {
            if(10%i==0 && co%i==0){
                return false;
            }
        }
        return true;
    }
}
