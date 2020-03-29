package com.itvdn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactoryDataProvider {
    private String param;

    @Factory(dataProvider = "dataProviderMethod")
    public TestFactoryDataProvider(String param) {
        this.param = param;
    }

    @DataProvider
    public static Object[][] dataProviderMethod() {
        return new Object[][]{{"data one"}, {"data two"}};
    }

    @Test
    public void testMethod() {
        System.out.println("Data is: " + param);
    }
}
