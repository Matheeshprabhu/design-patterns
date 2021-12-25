package creational.singleton;

public class EagerSingleton {

    //Prevents instantiation and inheritance
    private EagerSingleton(){

    }

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
