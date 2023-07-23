package ua.hillel.Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FilesClass {
    public static void main(String[] args) throws IOException {
        File file= new File("testFile.txt");
        List<String> lines = Files.readAllLines(file.toPath());

        File newFile= new File("testFile_out.txt");
        if (!newFile.exists()){
            newFile.createNewFile();
        }
        Files.write(newFile.toPath(), lines);


        System.out.println("done");
    }
}
