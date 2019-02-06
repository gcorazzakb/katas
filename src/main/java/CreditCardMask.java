public class CreditCardMask {

    public static String maskify(String s) {
        int length = s.length();
        if (length>4){
            return getHashtags(length -4)+s.substring(length-4,length);
        }else{
            return s;
        }
    }

    public static String getHashtags(int i){
        String ret="";
        for (int j = 0; j < i; j++) {
            ret+="#";
        }
        return  ret;
    }
}
