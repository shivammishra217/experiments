package Test;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Shivam Mishra on 31 Aug .
 **/



public class LambdaExpression {


    public static void main(String[] args) {

        // anonymousClassObject instantiation
        Consumer anonymousClassObject = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        // anonymousClassObject instantiation via lambda
        Consumer consumer = (x) -> {
            System.out.println(x);
        };



        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // stream.forEach() accept  reference of consumer interface.
        list.stream().forEach(x -> System.out.println(x));
        System.out.println();
        list.stream().forEach(consumer);
        System.out.println();
        list.stream().forEach(anonymousClassObject);




        list.stream().forEach(x -> System.out.println(x));



    }


}
