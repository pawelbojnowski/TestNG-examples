package utils;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class XMLTestSuiteRunnerUtils {
    private static final String BEASE_PATH = "./src/test/resources/";

    public static void run(String fileName) {
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add(BEASE_PATH + fileName);
        testng.setTestSuites(suites);
        testng.run();
    }
}
