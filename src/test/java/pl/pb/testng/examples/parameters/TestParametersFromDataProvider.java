package pl.pb.testng.examples.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestParametersFromDataProvider {
    public static final String DATA_PROVIDER_NAME = "dataProviderName";
    public static final String DATA_PROVIDER_ITERATOR = "dataProviderIterator";

    @DataProvider(name = DATA_PROVIDER_NAME)
    public Object[][] createData() {
        return new Object[][]{
                {"Value to test", new Integer(36)},
                {"Value to test", new Integer(37)},
        };
    }

    @DataProvider(name = DATA_PROVIDER_ITERATOR)
    public Iterator<Object[]> createDataIterator() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new String[]{"Value to test 1"});
        data.add(new String[]{"Value to test 2"});
        data.add(new String[]{"Value to test 3"});
        return data.iterator();
    }

    @Test(dataProvider = DATA_PROVIDER_NAME)
    public void testDataProviderFormMethod(String value1, Integer value2) {
        System.out.println("TestParametersFromDataProvider.testDataProviderFormMethod(): " + value1 + " " + value2);
    }

    @Test(dataProvider = DataProviderClass.NAME_OF_DATA_PROVIDER_FORM_CLASS, dataProviderClass = DataProviderClass.class)
    public void testDataProviderFormClass(String value1, Integer value2) {
        System.out.println("TestParametersFromDataProvider.testDataProviderFormClass(): " + value1 + " " + value2);
    }

    @Test(dataProvider = DATA_PROVIDER_ITERATOR)
    public void testDataProviderAsIterator(String value1) {
        System.out.println("TestParametersFromDataProvider.testDataProviderAsIterator(): " + value1);
    }

}
