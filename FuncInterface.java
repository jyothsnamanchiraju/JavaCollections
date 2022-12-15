package IterviewPreperation.JPMC;
/*Write a program to multiply two numbers using Functional Interface*/

public class FuncInterface {
    @FunctionalInterface
    public interface product{
        public int multiply(int a, int b );
    }
    public static void main(String[] args){
            product p = (a,b)->(a*b);
            System.out.println(p.multiply(8,9));
    }
}
