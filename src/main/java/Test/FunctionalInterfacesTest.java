package Test;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.FunctionalInterface;


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

        //stream.forEach() -- Performs an action for each element of this stream.
        list.stream().forEach( t-> System.out.println(t));
        list1.stream().forEach(x-> System.out.println("x = " + x));


        //Finding minimum over stream
        int min1 = Arrays.stream(new int[]{1, 2, 1, 4, 5}).min().orElse(0);
        System.out.println("min1 = " + min1);
        int min2 = Arrays.stream(new int[]{}).min().orElse(0);
        System.out.println("min2 = " + min2);


        // we cannot apply stream() over a map
        // map.stream() -- this doesn't exist
        // Instead, we can apply stream on entrySet() of map
        Map<String,String> map = new HashMap<>();
        map.put("Shivam","11");

        map.entrySet().stream().filter(
                x -> x.getKey() != null
        ).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));


    }

}
