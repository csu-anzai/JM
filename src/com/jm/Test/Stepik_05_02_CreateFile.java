package com.jm.Test;

import java.io.File;
import java.io.IOException;

public class Stepik_05_02_CreateFile {
    public static void main(String[] args) throws IOException {
        File dir1 = new File("C:/Users/hilkevichia/Desktop/SomeDir");
        File file1 = new File(dir1, "HelloWorld.txt");
//        dir1.mkdir();
//        dir1.delete();
//        file1.createNewFile();
//        file1.delete();
    }
}
