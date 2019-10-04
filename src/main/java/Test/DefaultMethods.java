package Test;

/**
 * Created by Shivam Mishra on 1 Sept .
 **/



interface interface1 {

    void abstractMethod1();
    static void staticMethod() {
        System.out.println("This is static method");
    }

    default void defaultMethod() {
        System.out.println("This is defaultMethod");

    }


}


public class DefaultMethods implements interface1{

//
//  The section Interfaces describes an example that involves manufacturers of computer-controlled cars
//  who publish industry-standard interfaces that describe which methods can be invoked to operate their cars.
//  What if those computer-controlled car manufacturers add new functionality, such as flight, to their cars?
//  These manufacturers would need to specify new methods to enable other companies (such as electronic guidance
//  instrument manufacturers) to adapt their software to flying cars. Where would these car manufacturers declare
//  these new flight-related methods? If they add them to their original interfaces, then programmers who have
//  implemented those interfaces would have to rewrite their implementations. If they add them as static methods,
//  then programmers would regard them as utility methods, not as essential, core methods.
//
//  **Default methods enable you to add new functionality to the interfaces of your libraries
//  and ensure binary compatibility with code written for older versions of those interfaces. **
//
// An interface can extend another interface
// When you extend an interface that contains a default method, you can do the following:
// - Not mention the default method at all, which lets your extended interface inherit the default method.
// - Redeclare the default method, which makes it abstract.
// - Redefine the default method, which overrides it.

    /**
     * - The class which implements the interface should provide an implementation for all the abstract methods
     * declared in the interface.
     *
     * - Static methods are associated to Interface , not to implementing class
     * -- we can refer to static methods by interfaceName.staticMethodName();
     *
     * - If we don't provide implementation of default methods in implementing class,
     * then implementation which is given in interface is considered.
     *
     * If we provide implementation of default methods in implementing class,
     * then implementation which is given in class is considered.
     *
     */

    public static void main(String[] args) {

        DefaultMethods defaultMethods = new DefaultMethods();
        defaultMethods.abstractMethod1();
        interface1.staticMethod();
        defaultMethods.defaultMethod();

    }

    @Override
    public void abstractMethod1() {
        System.out.println("This is abstract method , implemented in DefaultMethods class");
    }


    public void defaultMethod() {
        System.out.println("This is defaultMethod, implemented in class");
    }



}
