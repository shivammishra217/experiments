package Test;

import org.springframework.boot.util.LambdaSafe;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

/**
 * Created by Shivam Mishra on 29 Sept 2019 .
 **/

class Thread1 implements Runnable {


    public void run() {
        int  i =0;
        while(++i<1000000) {
            System.out.println("Thread1 : " + i);
        }
    }
}

class Thread2 implements Runnable {

    public void run() {
        int  i =0;
        while(++i<1000000) {
            System.out.println("Thread2 : " + i);
        }
    }
}

class Thread3 extends Thread {

    public void run() {
        int  i =0;
        while(++i<1000000) {
            System.out.println("Thread3 : " + i);
        }
    }
}

class Thread4 extends Thread {

    public void run() {
        int  i =0;
        while(++i<1000000) {
            System.out.println("Thread4 : " + i);
        }
    }
}


class Thread5 implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {

        int  i =0;
        while(++i<1000000) {
            System.out.println("Thread5 : " + i);
        }
        return i;
    }


}

public class MultiThreading {

    public static void main(String []args) throws ExecutionException, InterruptedException {

        Thread thread;

        Thread1 thread1 = new Thread1();
        new Thread(thread1).start();

        Thread2 thread2 = new Thread2();
        new Thread(thread2).start();

        Thread3 thread3 = new Thread3();
        thread3.start();

        Thread4 thread4 = new Thread4();
        thread4.start();

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Thread5 thread5 = new Thread5();
        Future<Integer> futureInteger = executor.submit(thread5);
        System.out.println("FutureInteger = " + futureInteger.get());


        BlockingQueue blockingQueue;

        Lock lock;

        ScheduledExecutorService scheduledExecutorService;


    }

}