package com.yagya.testapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArithmeticTest {
    Arithmetic arithmetic = null;
    @Before
    public void setUp(){
        arithmetic = new Arithmetic();
    }
    @Test
    public void testAddition(){
        float exceptedResult =10;
        float actualResult = arithmetic.add(4,6);
        assertEquals(exceptedResult, actualResult);
    }

    @After
    public void tearDown(){
        arithmetic = null;
    }
}
