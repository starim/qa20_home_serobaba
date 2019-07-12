import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  AppManeger app = new AppManeger();

  @BeforeMethod
  public void setUp() throws InterruptedException {
    app.init();

  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
