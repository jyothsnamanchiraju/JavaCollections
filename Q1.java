package IterviewPreperation.JPMC;
/*
Given Two string, identify the common prefix -
Eg.
I/P - Hyderabad, Secunderabad
O/P - derabad
Eg.
I/P - Apple, Mango
O/p - NULL
* */
public class Q1 {
    public static void main(String[] args) {
        String str1 = "Bangalore";
        String str2 = "Manga";

        String ans = check(str1, str2);
        if (ans == "")
            ans = check(str2, str1);

        System.out.println(ans);
    }

    public static String check(String s1, String s2){
        boolean match = false;
        int pos1 = 0; int pos2 = s1.length();
        String subStr = "";
        String revSubStr= "";
        String a = "";

        for(int i=0; i<s1.length(); i++){
            subStr = s1.substring(i, pos2);

            if(i == s1.length()-1){
                match = false;
                break;
            }

            if (s2.contains(subStr)) {
               // System.out.println(subStr);
                a = subStr;
                match = true;
                break;
            }
        }

        if(match == false){
            for(int i=s1.length()-1; i>0; i--){
                revSubStr = s1.substring(0,i);
                if(s2.contains(revSubStr)) {
                 //   System.out.println(revSubStr);
                    a = revSubStr;
                    match= true;
                    break;
                }
            }
        }

        if (match == false) {
            //System.out.println("Null");
            a = "";
        }

        return a;
    }
}

