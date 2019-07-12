import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppManeger {

    Board board;
    SessionHelper sh;
    WebDriver wd;

    public void init() throws InterruptedException {
      wd = new ChromeDriver();
      wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      wd.get("https://trello.com");
      sh = new SessionHelper(wd);

      board = new Board(wd);
    }

    public void stop() {
      wd.quit();
    }














    public boolean isElementPresent1(By locator){
      try {
        wd.findElement(locator);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }

    }

    public boolean isElementPresent2(By locator){
      return wd.findElements(locator).size()>0;
    }

    public boolean isUserIn(){
     return isElementPresent1(By.cssSelector("._1ZdG7TQ02p6Opb"));

    }




    public Board getBoard() {
        return board;
    }

    public SessionHelper getSh() {
        return sh;
    }
}
