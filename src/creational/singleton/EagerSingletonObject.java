package creational.singleton;

public class EagerSingletonObject {

    public static EagerSingletonObject obj = new EagerSingletonObject();

    private EagerSingletonObject(){
        System.out.println("Eager Object created");
    }

    public static EagerSingletonObject getInstance(){
        return obj;
    }
}
