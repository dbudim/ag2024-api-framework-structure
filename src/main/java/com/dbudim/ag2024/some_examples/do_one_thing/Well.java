package com.dbudim.ag2024.some_examples.do_one_thing;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;

public class Well {

    public File downloadFile(URL url, String path) throws IOException {
        File file = new File(path);
        FileUtils.copyURLToFile(url, file);
        return file;
    }

    public List<String> getFileContent(File file) throws IOException {
        return Files.readAllLines(file.toPath());
    }

}
