package solid.compositePattern.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String directoryName;
    private List<FileSystem> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        files.add(fileSystem);
    }


    @Override
    public void ls() {
        System.out.println("Directory Name : " + this.directoryName);
        for (FileSystem fileSystem : files) {
            fileSystem.ls();
        }
    }
}
