package creational.abstract_factory;

public interface Instance {

    enum Capacity{small, medium, large}
    void start();
    void stop();
    void attachStorage(Storage storage);
    void getStorage();
}
