package com.itvdn;

import org.testng.annotations.Factory;

public class TestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new ParameterizedTest(), new MatchersTest() };
    }
}
