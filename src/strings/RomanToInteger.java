package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInteger {

    private static Map map = Map.of("I", 1,
            "V", 5, "X",
            10, "L", 50, "C",
            100, "D", 500, "M", 1000);


    public static int romanToInt(String s) {
        int result = 0;

        for(int i=1;i<s.length();i++){
            int first = (int) map.get((new String(new char[] { s.charAt(i-1)})));
            int second  = (int) map.get((new String(new char[] { s.charAt(i)})));
            if(first<second){
                result -=first;
            }
            else {
                result+=first;
            }
        }
        result+=(int) map.get((new String(new char[] { s.charAt(s.length()-1)})));


        return result;
    }


    public static void main(String[] args) {


        String string ="";
        System.out.println("RES=" + romanToInt(string));

    }
}
