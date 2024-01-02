package com.dbudim.ag2024.configuration;

import com.dbudim.ag2024.exceptions.ParameterNotDefinedException;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import static com.dbudim.ag2024.configuration.Parameters.GITHUB_ACTIONS;
import static com.dbudim.ag2024.configuration.Parameters.PROJECT_URL;


/**
 * Created by dbudim on 17.12.2023
 */

public class Configuration {

    public static String getProjectUrl() {
        return getParameter(PROJECT_URL);
    }

    public static boolean isRemoteRun() {
        return Boolean.valueOf(System.getenv(GITHUB_ACTIONS));
    }

    public static boolean isLocalRun() {
        return !isRemoteRun();
    }

    public static String getParameter(String parameter) {
        String value = isRemoteRun()
                ? System.getProperty(parameter)
                : getParameterFromPropertyFile(parameter);

        if (value == null) {
            throw new ParameterNotDefinedException(parameter);
        }

        return value;
    }

    private static String getParameterFromPropertyFile(String key) {
        URL config = ClassLoader.getSystemResource("config.properties");
        if (config == null) {
            throw new RuntimeException("'config.properties' not found");
        }

        try (var stream = new FileInputStream(config.getPath())) {
            Properties properties = new Properties();
            properties.load(stream);
            return properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException("Problem while reading properties file", e);
        }
    }

}
