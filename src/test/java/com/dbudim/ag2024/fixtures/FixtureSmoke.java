package com.dbudim.ag2024.fixtures;

import com.dbudim.ag2024.client.BookStack;
import com.dbudim.ag2024.client.BookStackRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;

public class FixtureSmoke {

    protected BookStackRestClient client = new BookStackRestClient();
    protected BookStack bookStack = new BookStack(client);
    private Logger logger = LoggerFactory.getLogger(FixtureSmoke.class);


    @BeforeClass
    public void setUp() {
        logger.info("Set up global preconditions...");
    }
}
