package IterviewPreperation.JPMC;

public class StringFunc {
    public static void main(String[] args){
        String s1 = new String("String1");
        String s2 = new String("String1");

        System.out.println(s1==s2);  //checks it the objects are same
        System.out.println(s1.equals(s2));  //checks if the values are same
        s1.concat("String3");
        System.out.println(s1);
        s1 = s1.concat("String3");
        System.out.println(s1);
    }
}
