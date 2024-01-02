package com.dbudim.ag2024.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    public static List<String> readFileContent(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + path, e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + path, e);
        }
    }
}
