package IterviewPreperation.JPMC;
/*Find the smallest Kth element in an unsorted array.
If kth element is not present, return Null.
Eg.
I/P : 0, 1, 0, 1, 1, 1, 1, 0, 0, 1    K=3
O/P : Null

Eg.
I/P: 9, 3, 2, 7, 2, 5, 3, 8     K = 4
O/P : 7
* */

import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args){
        int[] a = {9, 3, 2, 7, 2, 5, 3, 8};         //{ 0, 1, 0, 1, 1, 1, 1, 0, 0, 1};
        int K = 4;

        String s = kSmallestValue(a,K);
        System.out.println(s);
    }

    public static String kSmallestValue(int[] a, int K){
        TreeSet<Integer> tset = new TreeSet<>();
        int count = 1; int val = 0; 
        for(int i: a){
            tset.add(i);
        }

        if(K > tset.size())
            return "Null";
        
        for(Integer i: tset){
            if(count == K) {
                val = i;
                break; 
            }
            count = count +1;
        }
        return String.valueOf(val); 
        
    }
}
