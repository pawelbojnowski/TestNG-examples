package pl.pb.testng.examples.overridingtestmethods;

import org.testng.annotations.Test;

public class TestCustomHookRunFromXML {

    @Test(groups = "GroupOne")
    public void testWithGroupOne() {
        System.out.println("TestCustomHookRunFromXML.testWithGroupOne()");
    }

    @Test(groups = "GroupTwo")
    public void testWithGroupTwo() {
        System.out.println("TestCustomHookRunFromXML.testWithGroupTwo()");
    }

    @Test(groups = "GroupThree")
    public void testWithGroupThree() {
        System.out.println("TestCustomHookRunFromXML.testWithGroupThree()");
    }

    @Test(groups = {"GroupFour", "GroupOne"})
    public void testWithGroupFour() {
        System.out.println("TestCustomHookRunFromXML.testWithGroupFour()");
    }
}
