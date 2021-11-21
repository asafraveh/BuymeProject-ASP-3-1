package buyme.webPages;

import org.openqa.selenium.By;
import buyme.base.BasePage;
import org.openqa.selenium.Keys;

public class LoginPage extends BasePage {

    public void register() {
        RegisterPage();
        Enterregistrationdetails();
    }

    private void RegisterPage() {
        clickElement(By.className("seperator-link"));
        clickElement(By.className("text-link"));
    }

    private void Enterregistrationdetails() {
        sendKeysToElement(By.className("ember-text-field"), "asaf");
        sendKeysToElement(By.cssSelector("input[placeholder = מייל]"), "asafravhe@gmail.com");
        sendKeysToElement(By.cssSelector("input[placeholder = סיסמה]"), "A162534a");
        sendKeysToElement(By.cssSelector("input[placeholder=\"אימות סיסמה\"]"), "A162534a");
    }

    public void confirmRegister() {
        clickElement(By.className("label"));
    }

    public void submitLogin() {
        clickElement(By.className("seperator-link"));
        sendKeysToElement(By.cssSelector("input[placeholder=\"מייל\"]"), "asafravhe@gmail.com");
       // sendKeysToElement(By.xpath("input[placeholder=\"מייל\"]"), String.valueOf(Keys.TAB));
        sendKeysToElement(By.cssSelector("input[placeholder=\"סיסמה\""),"A162534a");
        clickElement(By.cssSelector("button[type = submit]"));
    }


}
