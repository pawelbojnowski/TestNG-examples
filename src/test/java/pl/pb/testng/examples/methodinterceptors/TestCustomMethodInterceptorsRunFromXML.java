package pl.pb.testng.examples.methodinterceptors;

import org.testng.annotations.Test;

public class TestCustomMethodInterceptorsRunFromXML {

    @Test(groups = "GroupOne")
    public void testWithGroupOne() {
        System.out.println("TestCustomMethodInterceptorsRunFromXML.testWithGroupOne()");
    }

    @Test(groups = "GroupTwo")
    public void testWithGroupTwo() {
        System.out.println("TestCustomMethodInterceptorsRunFromXML.testWithGroupTwo()");
    }

    @Test(groups = "GroupThree")
    public void testWithGroupThree() {
        System.out.println("TestCustomMethodInterceptorsRunFromXML.testWithGroupThree()");
    }

    @Test(groups = {"GroupFour", "GroupOne"})
    public void testWithGroupFour() {
        System.out.println("TestCustomMethodInterceptorsRunFromXML.testWithGroupFour()");
    }
}
