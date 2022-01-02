package structural.composite;

public class BinaryFile extends File{

    private final int size;

    public BinaryFile(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }
}
