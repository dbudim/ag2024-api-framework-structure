package com.dbudim.ag2024.some_examples.chaining_exceptions_clear_report;

import com.dbudim.ag2024.fixtures.FixtureSmoke;
import org.testng.annotations.Test;

public class FindBookOnShelve extends FixtureSmoke {

    @Test
    public void findBookSmell(){
        var booksApi = new Smell(client);
        booksApi.findBookInShelve("ss","ssa");
    }

    @Test
    public void findBookWell(){
        var booksApi = new Well(client);
        booksApi.findBookInShelve("ss","ssa");
    }
}
