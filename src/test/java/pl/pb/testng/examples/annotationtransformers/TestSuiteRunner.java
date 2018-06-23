package pl.pb.testng.examples.annotationtransformers;

import org.testng.TestNG;

public class TestSuiteRunner {

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setAnnotationTransformer(new CustomTransformer());
        testng.setTestClasses(new Class[]{TestCustomTransformer.class});
        testng.run();
    }

}
