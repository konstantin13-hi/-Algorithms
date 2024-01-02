package HashTable;

import java.util.*;

public class IsomorphicStrings {


    public static boolean isIsomorphic(String s, String t) {
        Map map = new HashMap<>();
        Set set = new HashSet();
        Object fromMap;
        for (int i =0 ; i<s.length() ; i++){
          fromMap =  map.get(t.charAt(i));
           if(fromMap !=null ){
               if((char)fromMap != s.charAt(i)){
                   return false;
               }


           }
           else {
               if(set.contains(s.charAt(i))){
                   return false;
               }

               map.put(t.charAt(i),s.charAt(i));
               set.add(s.charAt(i));
           }



        }



        return true;

    }

    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "bar";
        System.out.println(isIsomorphic(s1,s2));

    }
}
