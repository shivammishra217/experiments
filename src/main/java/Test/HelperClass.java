package Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shivam Mishra on 24 July 2019 .
 **/

@Service
public class HelperClass {



    @Autowired
    ServiceClass serviceClass;

    public void testMethod1() {

        System.out.println("HelperClass = testMethod1");
    }


    public void testMethod2() {

        System.out.println("HelperClass = testMethod2");
        serviceClass.testMethod2();
    }


}
