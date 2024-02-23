package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    private static StringBuilder stringBuilder = new StringBuilder();
    private static Map map = Map.of(1, "I",
            5, "V",
            10, "X", 50, "L",
            100, "C", 500, "D", 1000, "M");
     private static Map<Integer,Integer> linked = new LinkedHashMap();



    public static String intToRoman(int num) {
        String number = Integer.toString(num);
        for (int i=0; i<number.length();i++){
            linked.put((int)Math.pow(10,number.length()-1-i),number.charAt(i)-'0');
        }
        linked.forEach((key, value) -> {
            if (value == 4 || value == 9) {
                if(value==4){
                    stringBuilder.append(map.get(key));
                    stringBuilder.append(map.get(key*5));

                }
                else {
                    stringBuilder.append(map.get(key));
                    stringBuilder.append(map.get(key*10));

                }

            }
            else {
                int cycle = value;
                String symbol = (String) map.get(key);
                if(map.get(key*value)==null) {

                    if(value>5){
                        stringBuilder.append(map.get(5*key));
                        for (int i=0;i<value-5;i++){
                            stringBuilder.append(map.get(key));
                        }
                    }
                    else {
                        for (int i = 0; i < cycle; i++) {
                            stringBuilder.append(symbol);
                        }
                    }


                }
                else {
                    stringBuilder.append(map.get(key*value));
                }

            }
        });

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
       System.out.println( intToRoman(58));



    }
}
