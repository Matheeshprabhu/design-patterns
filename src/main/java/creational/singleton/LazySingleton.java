package creational.singleton;

public class LazySingleton {

    private LazySingleton(){

    }

    // we use volatile to make our app not use cached value when working with threads
    private static volatile LazySingleton INSTANCE;

    public static LazySingleton getInstance(){
        if(INSTANCE == null){
            synchronized (LazySingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
