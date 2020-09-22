package creational.singleton;

public class LazySyncSingletonObject {
    public static LazySyncSingletonObject obj;

    private LazySyncSingletonObject(){
        System.out.println("Lazy Sync Object created");
    }

    public static synchronized LazySyncSingletonObject getInstance(){
        if(obj == null){
            obj = new LazySyncSingletonObject();
        }
        return obj;
    }
}
