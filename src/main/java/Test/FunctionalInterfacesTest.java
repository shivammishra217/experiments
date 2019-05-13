package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfacesTest {


    public static void main(String [] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //1
        list.stream().filter(
                t -> t%2==0
        ).forEach( t-> System.out.println(t));

        //2
       list.stream().filter(
                t -> t%2==0
        ).collect(Collectors.toList())
               .forEach( t-> System.out.println(t));


       // 1 and 2 will print same result.

        List<Integer> list1 = list.stream().filter(
                t -> t%2==0
        ).collect(Collectors.toList());

        // modified list1 , list will remain same.

        list.stream()
                .forEach( t-> System.out.println(t));
        
        list1.stream().forEach(x-> System.out.println("x = " + x));

    }


}
