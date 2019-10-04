package Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shivam Mishra on 24 July 2019 .
 **/


@Service
public class ServiceClass {


    @Autowired
    HelperClass helperClass;


    public void testMethod1() {

        System.out.println("ServiceClass = testMethod1");
        helperClass.testMethod2();
    }

    public void testMethod2() {

        System.out.println("ServiceClass = testMethod2");
    }
}
