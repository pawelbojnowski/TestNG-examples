package pl.pb.testng.examples.overridingtestmethods;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({CustomHook.class})
public class TestCustomHook {

    @Test(groups = "GroupOne")
    public void testWithGroupOne() {
        System.out.println("TestCustomHook.testWithGroupOne()");
    }

    @Test(groups = "GroupTwo")
    public void testWithGroupTwo() {
        System.out.println("TestCustomHook.testWithGroupTwo()");
    }

    @Test(groups = "GroupThree")
    public void testWithGroupThree() {
        System.out.println("TestCustomHook.testWithGroupThree()");
    }

    @Test(groups = {"GroupFour", "GroupOne"})
    public void testWithGroupFour() {
        System.out.println("TestCustomHook.testWithGroupFour()");
    }
}
