package buyme.webPages;

import org.openqa.selenium.By;
import buyme.base.BasePage;

public class SenderReceiverScreen extends BasePage {

    public void enterReceiverName() {
        clickElement(By.cssSelector("input[maxlength=\"25\"]"));
        sendKeysToElement(By.cssSelector("input[maxlength=\"25\"]"), "danyel");
        sendKeysToElement(By.cssSelector("textarea[rows=\"4\"]"), "תודה");


    }

    public void uploadPhoto() {
        sendKeysToElement(By.cssSelector("input[type=file]"), "C:\\Users\\sioas\\Desktop\\זמני\\c5a9c67c-c895-413f-b4ec-c8c4e63f27b0.jpg");
    }

    public void pressContinue() {
        clickElement(By.cssSelector("button[gtm=המשך]"));
    }


}


