package pl.pb.testng.examples.groups;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroupsDependOnGroup {

    @BeforeGroups("one")
    public void beforeTestGroupOne() {
        System.out.println("TestGroupsDependOnGroup.beforeTestGroupOne()");
    }

    @AfterGroups("one")
    public void afterTestGroupOne() {
        System.out.println("TestGroupsDependOnGroup.afterTestGroupOne()\n");
    }

    @BeforeGroups("two")
    public void beforeTestGroupTwo() {
        System.out.println("TestGroupsDependOnGroup.beforeTestGroupTwo() - will be not executed");
    }

    @AfterGroups("two")
    public void afterTestGroupTwo() {
        System.out.println("TestGroupsDependOnGroup.afterTestGroupTwo() - will be not executed\n");
    }

    //tests
    @Test(groups = "one")
    public void testGroupOne() {
        System.out.println("TestGroupsDependOnGroup.testGroupOne()");
        Assert.assertEquals("expected value", "actual value");
    }

    @Test(groups = "two", dependsOnGroups = "one")
    public void testGroupTwo() {
        System.out.println("TestGroupsDependOnGroup.testGroupTwo() - will be not executed");
    }
}