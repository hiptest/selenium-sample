package com.example;

import org.junit.Before;
import junit.framework.TestCase;

public class ProjectTest extends TestCase {
    public Actionwords actionwords;

    @Before
    public void setUp() throws Exception {
      actionwords = new Actionwords();
    }

    public void testSimpleTest() {
      actionwords.iOpenWebsite("http://google.fr");
      actionwords.iSearchForQuery("La poste");
      actionwords.siteAppearsInTheFirstPage("laposte.fr");
    }
}