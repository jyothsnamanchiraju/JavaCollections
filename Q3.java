package IterviewPreperation.JPMC;
/*
* A string of integers is given.
* If the adjacent values are even, join by '*' else join by '-'
* Eg.
* I/P : 21462675756
* O/P : 214*6*2*67-5-7-56
*
* Eg.
* I/P : 98676555533
* O/P : 98*6765-5-5-5-3-3
* */

public class Q3 {
    public static void main(String[] args){
        String s1 = "98676555533";
        String result = modify(s1);

        System.out.println(result);
    }
    public static String modify(String a){
        char[] arr = a.toCharArray();
        String res=String.valueOf(arr[0]), op="";
        char v1, v2 ;
        System.out.println(arr);

        for(int i=1; i<a.length(); i++){
            v1 = a.charAt(i-1);
            v2 = a.charAt(i);

            if(v1%2 ==0 && v2%2 ==0)
                op = "*";
            else if(v1%2 ==1 && v2%2==1)
                op = "-";
            else
                op = "";

            res = res+op+v2;
        }

        return res;
    }
}
