import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class Board {
    WebDriver wd;

    public Board(WebDriver wd) {

        this.wd = wd;
    }

    public void confirmBoardCreation() {
        click(By.cssSelector("[data-test-id=header-create-board-submit-button]"));
    }

    public void typeBoardName(String boardName){
        type(By.cssSelector("[data-test-id=header-create-board-title-input]"), boardName);

    }

    public void selectCreateBoardFromDropDown() {
        click(By.cssSelector("[data-test-id=header-create-board-button]"));
    }

    public int getPersonalBoardsCount() {
        return wd.findElements(By.xpath("//span[@class='icon-lg icon-member']/../../..//li")).size() - 1;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
