package creational.abstract_factory;

public class Client {

    private final ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(){
        Instance instance = resourceFactory.createInstance(Instance.Capacity.medium);
        Storage storage = resourceFactory.createStorage(30);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args){

        Client gcpClient = new Client(new GCPResourceFactory());
        
        Instance instance = gcpClient.createServer();
        instance.start();
        instance.stop();
        instance.getStorage();

        System.out.println("---------------------------------");
        Client awsClient = new Client(new AWSResourceFactory());

        Instance instance1 = awsClient.createServer();
        instance1.start();
        instance1.stop();
        instance1.getStorage();

    }

}
