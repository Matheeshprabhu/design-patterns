package creational.abstract_factory;

public class GCPResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance();
    }

    @Override
    public Storage createStorage(int capacityInGB) {
        return new GoogleCloudStorage();
    }
}
