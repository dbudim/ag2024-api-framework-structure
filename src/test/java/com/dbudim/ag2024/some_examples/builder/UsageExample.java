package com.dbudim.ag2024.some_examples.builder;

import com.dbudim.ag2024.client.models.Shelve;
import com.dbudim.ag2024.client.models.User;
import com.dbudim.ag2024.fixtures.FixtureSmoke;
import com.dbudim.ag2024.utils.ExecutionUtils;
import org.testng.annotations.Test;

import java.util.List;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;

public class UsageExample extends FixtureSmoke {

    @Test
    public void createShelveWithConstructor() {
        Shelve shelve = new Shelve("My Shelve",
                "my-shelve",
                "Sample shelve",
                "2023-12-25",
                "2023-12-26",
                new User(),
                new User(),
                new User(),
                List.of());
        execute(client.shelvesService.createShelve(shelve));
    }

    @Test
    public void createShelveWithBuilder() {
        Shelve shelve = new Shelve.Builder()
                .withName("My Shelve")
                .withSlug("sadasd")
                .build();

        execute(client.shelvesService.createShelve(shelve));
    }
}
