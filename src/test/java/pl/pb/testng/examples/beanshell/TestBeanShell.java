package pl.pb.testng.examples.beanshell;

import org.testng.annotations.Test;

public class TestBeanShell {

    @Test(groups = "BeanShellGroups")
    public void testExampleOne() {
        System.out.println("TestBeanShell.testExampleOne()");
    }

    @Test(groups = "BeanShellGroups")
    public void testExampleTwo() {
        System.out.println("TestBeanShell.testExampleTwo()");
    }

    @Test(groups = "AnotherGroup")
    public void testExampleThree() {
        System.out.println("TestBeanShell.testExampleThree()");
    }
}
