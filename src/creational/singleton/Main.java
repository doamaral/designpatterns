package creational.singleton;

public class Main {

    public static void main(String[] args) {

        //Running multiple times can get Racing conditions few times
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                LazySingletonObject obj = LazySingletonObject.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                LazySingletonObject obj = LazySingletonObject.getInstance();
            }
        });

        t1.start();
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                EagerSingletonObject eagerObj = EagerSingletonObject.getInstance();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            public void run() {
                EagerSingletonObject eagerObj = EagerSingletonObject.getInstance();
            }
        });

        t3.start();
        t4.start();

        //Lazy Singleton made Thread-safe with "synchronize"
        Thread t5 = new Thread(new Runnable() {
            public void run() {
                LazySyncSingletonObject obj = LazySyncSingletonObject.getInstance();
            }
        });
        Thread t6 = new Thread(new Runnable() {
            public void run() {
                LazySyncSingletonObject obj = LazySyncSingletonObject.getInstance();
            }
        });

        t5.start();
        t6.start();
    }
}
