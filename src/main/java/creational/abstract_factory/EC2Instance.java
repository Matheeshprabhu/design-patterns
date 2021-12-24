package creational.abstract_factory;

public class EC2Instance implements Instance{

    private Storage storage;
    @Override
    public void start() {
        System.out.println("Started EC2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopped EC2Instance");
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
