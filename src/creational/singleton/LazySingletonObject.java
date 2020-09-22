package creational.singleton;

public class LazySingletonObject {

    //This implementation has a Race Problem. It's not Thread-safe
    public static LazySingletonObject obj;

    private LazySingletonObject(){
        System.out.println("Lazy Object created");
    }

    public static LazySingletonObject getInstance(){
        if(obj == null){
            obj = new LazySingletonObject();
        }
        return obj;
    }
}
