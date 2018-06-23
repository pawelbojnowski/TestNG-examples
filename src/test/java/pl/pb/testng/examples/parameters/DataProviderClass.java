package pl.pb.testng.examples.parameters;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    public static final String NAME_OF_DATA_PROVIDER_FORM_CLASS = "nameOfDataProviderFormClass";

    @DataProvider(name = NAME_OF_DATA_PROVIDER_FORM_CLASS)
    public Object[][] createData() {
        return new Object[][]{
                {"Value to test 1", new Integer(25)},
                {"Value to test 2", new Integer(30)},
        };
    }
}
