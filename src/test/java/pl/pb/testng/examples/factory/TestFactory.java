package pl.pb.testng.examples.factory;

import org.testng.annotations.Factory;

public class TestFactory {

    @Factory
    public Object[] createFactory() {
        //any of object in array CANNOT be NULL
        Object[] objects = new Object[10];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new TestCase("Value to test " + i);
        }
        return objects;
    }
}
