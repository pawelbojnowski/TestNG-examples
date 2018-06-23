package pl.pb.testng.examples.factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactoryWithDataProvider {

    private static final String dataProviderForFactory = "dataProviderForFactory";

    private String valueToTest;

    @Factory(dataProvider = dataProviderForFactory)
    public TestFactoryWithDataProvider(String valueToTest) {
        this.valueToTest = valueToTest;
    }

    @DataProvider(name = dataProviderForFactory)
    static public Object[][] dataProviderForFactory() {
        return new Object[][]{
                new Object[]{"[DataProvider] Value to test 1"},
                new Object[]{"[DataProvider] Value to test 2"},
        };
    }

    @Test
    public void testValueToTest() {
        System.out.println("TestFactoryWithDataProvider.testValueToTest()");
        System.out.println(valueToTest);
    }
}
