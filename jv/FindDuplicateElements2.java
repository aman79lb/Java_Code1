import java.util.*;
public class FindDuplicateElements2 {



    public static void main(String[] args) {


        int arr[]= {1,2,3,4,4,56,2,2,2};

        System.out.println("duplicate elements are: ");
        Set<Integer> s= new HashSet<>();
        for (int no :arr ) {

            if (s.add(no)==false) {  // here this add method will gie output in the boolean form
                System.out.println(no+ "");

            }

        }


    }
}