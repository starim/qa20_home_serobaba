import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {

    private WebDriver wd;


    public SessionHelper(WebDriver wd) {

        this.wd = wd;

    }

    public void confirmLogin() {
        click(By.id("login"));
    }


    public void fillLoginForm(String email, String password) {
        type(By.id("user"), email);
        type(By.name("password"), password);
    }

    public void login(String email, String pwd) throws InterruptedException {
        clickLoginButton();
        fillLoginForm(email, pwd); //"elena.telran@yahoo.com", "12345.com"
        pause(3000);
        confirmLogin();
        pause(10000);
    }

    public void click(By locator) {
        wd.findElement(locator).click();

    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void clickLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }


    public void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[name=add]"));
    }

    public void returnToHomePage() {
        click(By.xpath("//*[@class='_2O4TvNuF7v0hxu GAI2GE8czAVHCQ _2CENIFUGJiOGXv _3Equ0AwjtQdiIh']"));
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}
