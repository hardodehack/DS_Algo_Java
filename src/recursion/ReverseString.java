package recursion;

/**
 *  @author Hardik
 *
 *
 **/

public class ReverseString {
    static String opStr;

    static String recurString(String str) {

        if(str.length()==1){
            return str;
        }else{
            opStr = str.charAt(str.length()-1)+recurString(str.substring(0,str.length()-1));
            return opStr;
        }
    }

    public static void main(String[] args) {
        System.out.println(recurString("H"));
    }

}
