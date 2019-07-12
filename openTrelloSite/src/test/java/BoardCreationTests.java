import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests  extends TestBase{
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
  if(!app.isUserIn()){
    app.login("sergejserobaba@gmail.com", "ZaeblO11");
    }
  }

  @Test
  public void testBoardCreationFromHeader() throws InterruptedException {

    int before = app.getBoard().getPersonalBoardsCount();

    app.getBoard().clickOnPlusButtonOnHeader();
    app.getBoard().selectCreateBoardFromDropDown();
    app.pause(10000);
    app.getBoard().typeBoardName("qa20" + System.currentTimeMillis());
    app.getBoard().confirmBoardCreation();
    app.pause(10000);

    app.pause(10000);
    app.returnToHomePage();
    app.pause(10000);
    int after = app.getBoard().getPersonalBoardsCount();



    Assert.assertEquals(after, before+1);
  }

}
