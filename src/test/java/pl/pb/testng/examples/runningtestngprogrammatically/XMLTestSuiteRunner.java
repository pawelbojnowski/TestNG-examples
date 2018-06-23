package pl.pb.testng.examples.runningtestngprogrammatically;

import org.testng.TestNG;
import org.testng.collections.Lists;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class XMLTestSuiteRunner {

    public static void main(String[] args) {
        runTestUsingClass();
        definedAndRunTestSuiteProgrammatically();
        runProgrammaticallyTestSuiteDefinedInXML();
    }

    private static void runTestUsingClass() {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[]{TestExample.class});
        testng.run();
    }

    private static void definedAndRunTestSuiteProgrammatically() {
        XmlSuite suite = new XmlSuite();
        suite.setName("running_testng_programmatically");

        XmlTest test = new XmlTest(suite);
        test.setName("TestExampleName");
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("pl.pb.testng.examples.runningtestngprogrammatically.TestExample"));
        test.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.run();
    }

    private static void runProgrammaticallyTestSuiteDefinedInXML() {
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("./src/test/resources/testng-custom-suite-running-testng-programmatically.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}
