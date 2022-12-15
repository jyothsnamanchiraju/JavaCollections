package IterviewPreperation.JPMC;

/*Adding two numbers using functional interface*/

public class FuncInterfaceAdd {
    @FunctionalInterface
    public interface sum{
        public int summation(int a,int b);
    }

    public static void main(String[] args){
        sum s = (a,b)->(a+b);
        System.out.println(s.summation(9,10));
    }
}
