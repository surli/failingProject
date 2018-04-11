package my.organization;

import org.junit.Test;

public class TestPerson {

    @Test(expected = IllegalAccessException.class)
    public void testGetAgeWithNull() throws IllegalAccessException {
        new Person("bla", "truc").getAge();
    }
}
