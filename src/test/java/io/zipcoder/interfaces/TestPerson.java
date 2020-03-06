package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        String name = "Zeth";
        long id = 24l;
        Person person = new Person(id, name);

        String expected = name;
        String actual = person.getName();

        long expected1 = id;
        long actual1 = person.getId();

        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual1, expected1);
    }
}
