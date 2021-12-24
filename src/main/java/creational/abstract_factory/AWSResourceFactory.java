package creational.abstract_factory;

public class AWSResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance();
    }

    @Override
    public Storage createStorage(int capacityInGB) {
        return new S3Storage();
    }
}
