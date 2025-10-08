package hooks;

import io.cucumber.java.After;
import utilities.Driver;

public class Hooks {

    @After("@DeleteChars")//import io.cucumber.java.After;
    public void tearDown() {
        Driver.closeDriver();
    }

}
