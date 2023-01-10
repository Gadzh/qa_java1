package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CatParametrizedTest {
    private final String catSex;
    private final boolean expected;

    public CatParametrizedTest(String catSex, String expected) {
        this.catSex = catSex;
        this.expected = Boolean.parseBoolean(expected);
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getData() {
        return new Object[][] {
                { "Самка", "false"},
                { "Самец", "true"},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(catSex);
        assertEquals(expected, lion.doesHaveMane());
    }

}