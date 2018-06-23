package pl.pb.testng.examples.dependencyinjection;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestNativeDependencyInjection {

    private static final String DATA_PROVIDER = "dataProvider";

    @DataProvider(name = DATA_PROVIDER)
    public Object[][] dataProvider() throws Exception {
        return new Object[][]{{ExampleDependencyClass.class.getMethod("exampleFunction")}};
    }

    @Test(dataProvider = DATA_PROVIDER)
    public void withoutInjection(@NoInjection Method value) {
        System.out.println("TestNativeDependencyInjection.withoutInjection(@NoInjection): " + value.getName());
        // value - the 'value' comes from data provider
        Assert.assertEquals(value.getName(), "exampleFunction");
    }

    @Test(dataProvider = DATA_PROVIDER)
    public void withInjection(Method value) {
        System.out.println("TestNativeDependencyInjection.withInjection(): " + value.getName());
        // value - this value is injected, the 'value' represents current test method
        //          and override object 'Method' form data provider in this case.
        Assert.assertEquals(value.getName(), "withInjection");
    }
}
