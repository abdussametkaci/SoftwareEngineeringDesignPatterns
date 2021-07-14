package Lesson15.Example2Visitor;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileVisitorClient {

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("c:\\dosyalar"), new MyFileVisitor());
    }
}
