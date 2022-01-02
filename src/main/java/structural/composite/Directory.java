package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File{

    private final List<File> children = new ArrayList<>();

    public Directory(String name){
        super(name);
    }

    public void addFile(File file){
        children.add(file);
    }

    public boolean removeFile(File file){
        return children.remove(file);
    }

    public File[] getFiles(){
        return children.toArray(new File[children.size()]);
    }

    @Override
    public void ls() {
        System.out.println(getName());
        children.forEach(File::ls);
    }
}
