package creational.abstract_factory;

public class GoogleComputeEngineInstance implements Instance{

    private Storage storage;

    @Override
    public void start() {
        System.out.println("Started Google compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Google compute engine instance");
    }

    @Override
    public void getStorage(){
        System.out.println(storage);
    }

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage;
    }
}
