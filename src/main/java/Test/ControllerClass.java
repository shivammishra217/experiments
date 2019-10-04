package Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Shivam Mishra on 24 July 2019 .
 **/

@RestController
public class ControllerClass {


    @Autowired
    ServiceClass serviceClass;

    // Testing inter-dependencies between two services

    @GetMapping("/test")
    public void testMethod() {

        System.out.println("ControllerClass = testMethod");
        serviceClass.testMethod1();


    }
}
