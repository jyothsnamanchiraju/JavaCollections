package IterviewPreperation.JPMC;
/*Program to demonstrate difference between Limit & Skip intermediate operations in Streams*/
import java.util.List;
import java.util.Arrays;
public class LimitVsSkip {
    public static void main(String[] args){
        List<String> sList = Arrays.asList("Anna", "Banana", "Canon", "Danny", "Enny", "Funny", "Genny", "Honey");
        sList.stream().skip(3).forEach(x->System.out.print("  "+x));
        System.out.println();
        sList.stream().limit(5).forEach(x->System.out.print("  "+x));
    }
}
