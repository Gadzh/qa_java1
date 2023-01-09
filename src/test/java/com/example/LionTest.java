package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {



    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самка");
        assertEquals(2, feline.getKittens());
    }


    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}