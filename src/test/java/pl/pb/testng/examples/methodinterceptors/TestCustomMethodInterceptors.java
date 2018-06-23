package pl.pb.testng.examples.methodinterceptors;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({CustomMethodInterceptors.class})
public class TestCustomMethodInterceptors {

    @Test(groups = "GroupOne")
    public void testWithGroupOne() {
        System.out.println("CustomMethodInterceptors.testWithGroupOne()");
    }

    @Test(groups = "GroupTwo")
    public void testWithGroupTwo() {
        System.out.println("CustomMethodInterceptors.testWithGroupTwo()");
    }

    @Test(groups = "GroupThree")
    public void testWithGroupThree() {
        System.out.println("CustomMethodInterceptors.testWithGroupThree()");
    }

    @Test(groups = {"GroupFour", "GroupOne"})
    public void testWithGroupFour() {
        System.out.println("CustomMethodInterceptors.testWithGroupFour()");
    }
}
