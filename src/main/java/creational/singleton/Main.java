package creational.singleton;

public class Main {

    public static void main(String[] args){

        EagerSingleton eagerInstance = EagerSingleton.getInstance();
        EagerSingleton eagerInstance2 = EagerSingleton.getInstance();
        System.out.println(eagerInstance);
        System.out.println(eagerInstance2);
        System.out.println(eagerInstance == eagerInstance2);

        System.out.println("-----------------------------------------------");


        LazySingleton lazyInstance = LazySingleton.getInstance();
        LazySingleton lazyInstance2 = LazySingleton.getInstance();
        System.out.println(lazyInstance);
        System.out.println(lazyInstance2);
        System.out.println(lazyInstance == lazyInstance2);


        System.out.println("-----------------------------------------------");


        LazyRegistryIODH lazyRegistryInstance = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistryInstance2 = LazyRegistryIODH.getInstance();
        System.out.println(lazyRegistryInstance);
        System.out.println(lazyRegistryInstance2);
        System.out.println(lazyRegistryInstance == lazyRegistryInstance2);
    }
}
