package com.dbudim.ag2024.some_examples.configurability;

import com.dbudim.ag2024.configuration.Configuration;
import org.testng.annotations.Test;

public class TestConfigurability {

    @Test
    public void printConfiguration() {
        System.out.println("PROJECT HOST: " + Configuration.getProjectUrl());
    }
}
