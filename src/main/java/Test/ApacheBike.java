package Test;

/**
 * Created by Shivam Mishra on 12 May 2019 .
 **/


class Bike {

    public void speed(int speed, String avg) {
        System.out.println("Bike speed =" + speed + "  avg = " + avg);
    }

    public void speedWithSameArgumentType(int speed, int avg) {
        System.out.println("speedWithSameArgumentType Bike speed =" + speed + "  avg = " + avg);
    }
}


//Method Overiding test
public class ApacheBike extends Bike{

    public void speed(String avg, int speed) {
        System.out.println("Apache Bike speed = " + speed + "  avg = " + avg);
    }

    public void speedWithSameArgumentType(int speed, int avg) {
        System.out.println("speedWithSameArgumentType Apache Bike speed =" + speed + "  avg = " + avg);
    }

    public static void main(String [] args) {
        Bike bike = new ApacheBike();
        //bike.speed("100", 50);


        //ApacheBike's speedWithSameArgumentType(10,10); overrides Bike's speedWithSameArgumentType(10,10) method
        // because both methods have same method signature , that is , void speedWithSameArgumentType(int,int).
        // But
        // ApacheBike's speed("10",10); does not override Bike's speed(10,"10") method
        // because both methods have different method signature , that is , void speed(String,int) and void speed(int,String).


        bike.speedWithSameArgumentType(10,10);
    }
}


