package Test;

interface  InterfaceTest {
    int run();
    int var1 = 10;
    default int defaultMethod() {
        return 1;
    }
}
//
// private, protected modifier is not allowed for method in interface.
// default modifier is allowed, then we should also be implementing body of the method in interface.
// By default, All the methods in the interface are internally public abstract.
// All the variables in the interface are internally public static final that is constants.
// Classes can implement the interface and not extends.
// The class which implements the interface should provide an implementation for all the abstract methods declared in the interface.
// We can override default method of Interface in the implementation class.
// Interfaces are ,by default, public and abstract, hence cannot be instantiated.


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


    public static void main(String []args) {
        InterfaceTest interfaceTestImpl = new InterfaceTestImpl();
        interfaceTestImpl.run();
    }
}