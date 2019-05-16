package Test;

import java.util.ArrayList;

/**
 * Created by Shivam Mishra on 12 May 2019 .
 **/
public abstract class AbstractClassTest {

    abstract int abstractMethod();

    protected int nonAbstractMethod() {
        return 0;
    }

    private int nonAbstractMethod1() {
        return 0;
    }

    public int nonAbstractMethod2() {
        return 0;
    }

//    default int nonAbstractMethod3() {
//        return 0;
//    }

    public abstract int abstractMethod1();

//     abstract method in abstract cannot be declared private, protected, they should be public and are by default public
//     so that other class can provide implementation for that method.
//     we cannot declare default methods in abstract class, Default methods can only be declared in an interface.
//     We can pass the reference of Subclass which extends the Abstract class to the abstract class object.
//     AbstractClassTest abstractClassTest = new AbstractClassTestExt();
//     The concrete Subclass which extends the Abstract class should provide the implementation for abstract methods
//


}


class AbstractClassTestExt extends AbstractClassTest {


    int abstractMethod() {
        return 11;
    }

    public int abstractMethod1() {
        return 111;
    }

    protected int nonAbstractMethod() {
        return 1111;
    }


    public static void main(String []args) {
        AbstractClassTest abstractClassTest = new AbstractClassTestExt();
        System.out.println(abstractClassTest.abstractMethod());
        System.out.println(abstractClassTest.abstractMethod1());
        System.out.println(abstractClassTest.nonAbstractMethod());

    }
}


