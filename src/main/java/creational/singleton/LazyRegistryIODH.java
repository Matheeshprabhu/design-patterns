package creational.singleton;

public class LazyRegistryIODH {

    private LazyRegistryIODH(){

    }

    private static class RegistryHolder{

        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
