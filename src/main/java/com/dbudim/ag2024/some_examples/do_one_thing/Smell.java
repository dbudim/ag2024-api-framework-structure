package com.dbudim.ag2024.some_examples.do_one_thing;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;

public class Smell {

    public static List<String> downloadFileAndGetText(URL url) throws IOException {
        File file = new File(".../file_path/...");
        FileUtils.copyURLToFile(url, file);
        List<String> data = Files.readAllLines(file.toPath());
        return data;
    }
}
