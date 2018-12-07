package pl.pb.testng.examples.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


@Test()
public class TestGroups {

    /**
     * Run this test with testng-custom-suite-groups.xml
     * should run only:
     * beforeTestGroupOne()
     * testGroupOne()
     * afterTestGroupOne()
     */

    @BeforeGroups("one")
    public void beforeTestGroupOne() {
        System.out.println("TestGroups.beforeTestGroupOne()");
    }

    @AfterGroups("one")
    public void afterTestGroupOne() {
        System.out.println("TestGroups.afterTestGroupOne()\n");
    }

    @BeforeGroups("two")
    public void beforeTestGroupTwo() {
        System.out.println("TestGroups.beforeTestGroupTwo()");
    }

    @AfterGroups("two")
    public void afterTestGroupTwo() {
        System.out.println("TestGroups.afterTestGroupTwo()\n");
    }

    //tests
    @Test(groups = "one")
    public void testGroupOne() {
        System.out.println("TestGroups.testGroupOne()");
    }

    @Test(groups = "two")
    public void testGroupTwo() {
        System.out.println("TestGroups.testGroupTwo()");
    }

}
