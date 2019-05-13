package Test;

/**
 * Created by Shivam Mishra on 11 May 2019 .
 **/
public class ConstructorTest {

    String name;
    int value;

    public ConstructorTest(String name,int value) {
        this.name = name;
        this.value = value;
    }

    public static void main(String []args) {
        ConstructorTest constructorTest = new ConstructorTest();
    }
}
