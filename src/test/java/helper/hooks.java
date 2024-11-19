package helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeEach;

public class hooks extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver(); // Initialize the WebDriver
    }

    @After
    public void afterTest() {
        closeDriver(); // Close and clean up the WebDriver
    }
}
