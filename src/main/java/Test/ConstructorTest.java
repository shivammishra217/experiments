package Test;

/**
 * Created by Shivam Mishra on 11 May 2019 .
 **/
public class ConstructorTest {

    String name;
    int value;

    public ConstructorTest() {
        System.out.println(" in constructor");
    }

    public ConstructorTest(String name, int value) {
        this.name = name;
        this.value = value;
    }


//    If a user doesn’t create a constructor implicitly, then a default constructor will be created.
//    If the user created a constructor with a parameter then he should create another constructor explicitly
//    without a parameter.

    public static void main(String []args) {
        ConstructorTest constructorTest = new ConstructorTest();
        constructorTest.run();

    }

    private void run() {
        System.out.println(" in run method  " + name + "   " + value);
    }
}
