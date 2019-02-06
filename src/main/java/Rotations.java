import java.util.List;

public class Rotations {

    public static boolean containAllRots(String strng, List<String> arr) {
        for (int i = 0; i < strng.length(); i++) {
            if (!arr.contains(rotate(strng,i))){
                return false;
            }
        }
        return true;
    }

    public static String rotate(String s, int i){
        return s.substring(i,s.length())+s.substring(0,i);
    }
}