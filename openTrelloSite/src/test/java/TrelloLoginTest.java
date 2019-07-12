import org.testng.annotations.Test;

public class TrelloLoginTest  extends  TestBase{

  @Test
  public void loginTest() throws InterruptedException {
    app.getBoard().clickLoginButton();
    app.fillLoginForm("sergejserobaba@gmail.com", "ZaeblO11");
    app.pause(3000);
    app.confirmLogin();
    app.pause(10000);

  }

}
