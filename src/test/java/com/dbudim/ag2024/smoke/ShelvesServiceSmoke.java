package com.dbudim.ag2024.smoke;

import com.dbudim.ag2024.fixtures.FixtureSmoke;
import org.testng.annotations.Test;

import java.io.IOException;

public class ShelvesServiceSmoke extends FixtureSmoke {

    @Test
    public void getShelves() throws IOException {
        client.shelvesService.getShelves().execute().body();
    }
}
