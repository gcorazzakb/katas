public class Travel {
    public static String travel(String ad, String zipcode) {
        if (ad.equals("") || zipcode.equals("")){
            return zipcode+":/";
        }
        String allWithZipCode = getAllWithZipCode(getZipCode(zipcode), ad);
        String[] split = allWithZipCode.split(",");
        String streets="";
        String houseNumbers="";
        for (int i = 0; i < split.length; i++) {
            String adress = split[i];
            if (!adress.equals("")) {
                streets += getStreetFromAdress(adress);
                houseNumbers += getHouseNumber(adress);
                if (i < split.length - 1) {
                    streets += ",";
                    houseNumbers += ",";
                }
            }
        }
        return zipcode+":"+streets+"/"+houseNumbers;
    }


    public static int getZipCode(String s) {
        String[] split = s.split(" ");
        return Integer.valueOf(split[split.length-1]);
    }

    public static String getZipCodeFull(String s) {
        return getZipCodeLetters(s)+ " " +getZipCode(s);
    }

    public static int getHouseNumber(String s) {
        String[] split = s.split(" ");
        return Integer.valueOf(split[0]);
    }

    public static String getZipCodeLetters(String s) {
        int l = s.length();
        return s.substring(l-8,l-6);
    }


    public static String getAllWithZipCode(int zipcode, String ad) {
        String ret="";
        String[] adresses = ad.split(",");
        boolean first=true;
        for (int j = 0; j < adresses.length; j++) {
            String adress = adresses[j];
            if (getZipCode(adress)==zipcode){
                if (first){
                    first=false;
                    ret+=adress;
                }else{
                    ret+=","+adress;
                }
            }
        }
        return  ret;
    }

    public static String getStreetFromAdress(String adress) {
        String ret="";
        String[] adressParts = adress.split(" ");
        for (int i = 1; i < adressParts.length-2; i++) {
            ret+=adressParts[i]+" ";
        }
        if (ret.length()>0)
            ret=ret.substring(0,ret.length()-1);
        return ret;
    }
}