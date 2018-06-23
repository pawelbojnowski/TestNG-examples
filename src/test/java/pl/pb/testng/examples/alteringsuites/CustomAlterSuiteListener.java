package pl.pb.testng.examples.alteringsuites;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

import java.util.List;

/*
 *This listener cannot be added to execution using the @Listeners annotation.
 */
public class CustomAlterSuiteListener implements IAlterSuiteListener {

    public void alter(List<XmlSuite> suites) {
        System.out.println("CustomAlterSuiteListener.alter()");
        XmlSuite suite = suites.get(0);
        suite.setName("Name of suit was changed form 'altering_suites' to " + getClass().getSimpleName());
    }
}
