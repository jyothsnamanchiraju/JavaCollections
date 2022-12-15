package IterviewPreperation.JPMC;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        String s = ldt.toString()+"[Asia/Karachi]";
        System.out.println("s= "+s);

        ZonedDateTime z =   ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println(z);

        int a = 90, b=23;
        System.out.println((a&1)==0 ? "true" : "false");  //check if the no. is even/odd
        System.out.println((b&1)==0 ? "true" : "false");

        System.out.println(a<<1);       //fast multiplications by 2 (shifting the bits)
        System.out.println(a>>1);       //fast division by 2

        //swapping the numbers using XOR
        a ^= b; // System.out.println("a= "+a+"..b= "+b);
        b ^= a; // System.out.println("a= "+a+"..b= "+b);
        a ^= b;
        System.out.println("a= "+a+"..b= "+b);


        //Finding the most significant digit in a given no.
        double K = Math.log10(1128611275);  System.out.println("K =" +K);
        K = K - Math.floor(K);          System.out.println("K =" +K);
        int x = (int)Math.pow(10,K);
        System.out.println("Most significant element of 298675 is "+x);

        //number of digits in the given number - 112861127
        System.out.println((int)Math.floor(Math.log10(112861127))+1);

    }
}
