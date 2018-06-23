package pl.pb.testng.examples.factory;

import org.testng.annotations.Test;

public class TestCase {
    private String valueToTest;

    public TestCase(String valueToTest) {
        this.valueToTest = valueToTest;
    }

    @Test
    public void testValueToTest() {
        System.out.println("TestCase.testValueToTest()");
        System.out.println(valueToTest);
    }
}
