package IterviewPreperation.JPMC;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
/*printing the duplicate values in the give collection*/
public class Q4 {
    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(10,20,34,10,20,34, 56, 78,33, 99, 25,25);
        Set<Integer> s1 = new HashSet<>();
        l1.stream().filter(x->!(s1.add(x))).collect(Collectors.toSet()).forEach(x->System.out.println(x));

        List<String> b1 = Arrays.asList("Anna", "Banana", "Madonna", "Anna", "Banana", "Madonna", "Piano", "Violin");
        Set<String> a1 = new HashSet<>();
        b1.stream().filter(x->!(a1.add(x))).collect(Collectors.toSet()).forEach(x->System.out.println(x));
    }
}
