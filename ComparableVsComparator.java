package IterviewPreperation.JPMC;
/*Write a comparator in JAva to compare two employees based upon name, age and address*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class ComparableVsComparator {

public static class employee implements Comparable<employee> {
    private int id;
    private String name;
    private int age;
    private String address;

    public employee(int id, String name, int age, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*Comparable interface is implemented at class level
    * we override the compareTo() method of the interface
    * it is useful to sort the records according to one class variable only. */
    public int compareTo(employee e1){
        return this.getId() - e1.getId();
    }
}

public static class ageComparator implements Comparator<employee>{
    @Override
    public int compare(employee e1, employee e2){
        return e1.getAge() - e2.getAge();
    }
}
public static class nameComparator implements Comparator<employee>{
    @Override
    public int compare(employee e1, employee e2){
        return e1.getName().compareTo(e2.getName());
    }
}

public static void main(String[] args){
    List<employee> listOfEmp = Arrays.asList
                   (new employee(10, "Madhavi", 34,"Kondapur, Hyd"),
                    new employee(8, "Lalitha", 30,"Madhapur, Hyd"),
                    new employee(5, "Pranathi", 25,"Gachibowli, Hyd"),
                    new employee(15, "Keerthana", 38,"Anand Nagar, Hyd"),
                    new employee(9, "Prema", 36,"Anand Bagh, Hyd"));

    Collections.sort(listOfEmp);  //implementing overridden CompareTo method of Comparable interface
    for(employee e: listOfEmp)
        System.out.println(e.getId()+") "+e.getName()+", Age: "+e.getAge()+" Address: "+e.getAddress());

    System.out.println("\n Sorted by Name: ");
    nameComparator n1 = new nameComparator(); // implementing the Comparator class
    Collections.sort(listOfEmp, n1);
    for(employee e: listOfEmp)
        System.out.println(e.getId()+") "+e.getName()+", Age: "+e.getAge()+" Address: "+e.getAddress());


    System.out.println("\n Sorted by Age: ");
    ageComparator a1 = new ageComparator();
    Collections.sort(listOfEmp, a1);
    for(employee e: listOfEmp)
        System.out.println(e.getId()+") "+e.getName()+", Age: "+e.getAge()+" Address: "+e.getAddress());
}
}
