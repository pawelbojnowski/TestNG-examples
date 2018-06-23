package pl.pb.testng.examples.groups;

import org.testng.annotations.Test;

@Test(groups = {"mainGroup"})
public class TestGroupsPartial {

    @Test(groups = "one")
    public void testGroupOne() {
        System.out.println("TestGroupsPartial.testGroupOne()");
    }

    public void testGroupTwo() {
        System.out.println("TestGroupsPartial.testGroupTwo() - this test (function) will ba also executed");
    }
}