package Test;


import java.time.LocalDateTime;

interface  InterfaceTest {
    int run();
    int var1 = 10;
    default int defaultMethod() {
        return 1;
    }
    static int staticMethod() {return 0;}


    //private int var2 = 10;

    //protected int var2 = 10;

//  private int nonAbstractMethod1() { return 0; }
//  protected int nonAbstractMethod1() { return 0; }

}

// All method declarations in an interface, including static methods, are implicitly public,
// so you can omit the public modifier.

// private, protected modifier is not allowed for method and fields in interface.
// default modifier is allowed, then we should also be implementing body of the method in interface.
// By default, All the methods in the interface are internally public abstract.
// All the variables in the interface are internally public static final that is constants.
// Classes can implement the interface and not extends.
    // The class which implements the interface should provide an implementation for all the abstract methods declared in the interface.
// We can override default method of Interface in the implementation class.
// Interfaces are ,by default, public and abstract, hence cannot be instantiated.


// An interface can extend another interface
//When you extend an interface that contains a default method, you can do the following:
// - Not mention the default method at all, which lets your extended interface inherit the default method.
// - Redeclare the default method, which makes it abstract.
// - Redefine the default method, which overrides it.





class InterfaceTestImpl implements InterfaceTest {

    @Override
    public int run() {
        System.out.println(defaultMethod());
        return 0;
    }

    @Override
    public int defaultMethod() {
        return 111;
    }


    public static void main(String []args) throws InterruptedException {
        InterfaceTest interfaceTestImpl = new InterfaceTestImpl();
        interfaceTestImpl.run();

        Thread t = new Thread();
        t.join();
        Thread.yield();
        t.wait();


    }
}