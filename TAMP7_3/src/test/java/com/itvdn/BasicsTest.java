package com.itvdn;


import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;


public class BasicsTest {

    @Test
    public void passingTest() {
        System.out.println("I'm a simple test that passes!");
    }

}
