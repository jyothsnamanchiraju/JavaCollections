package IterviewPreperation.JPMC;
/*Count the number of occurances of a word in the given String*/

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
public class countOccurance {
    public static void main(String[] args){
        String str = "welcome to code decode and code decode welcome you";
        List<String> s1 = Arrays.asList(str.split(" "));

        System.out.println(s1);
        HashMap<String,Integer> h1 = new HashMap<>();

        s1.stream().forEach(x-> {if(h1.containsKey(x))
                                    h1.put(x,(h1.get(x)+1));
                                 else
                                     h1.put(x,1);}) ;

        for(String s : h1.keySet())
            System.out.println(s+"= "+h1.get(s));
    }

}
