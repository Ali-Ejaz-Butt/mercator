package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("Initializing WebDriver");
        Driver.initDriver();
    }

    @After
    public void teardown() {
        System.out.println("Quitting WebDriver");
        Driver.quitDriver();
    }
 }
