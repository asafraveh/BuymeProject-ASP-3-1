package buyme.webPages;

import org.openqa.selenium.By;
import buyme.base.BasePage;

public class HowToSendPage extends BasePage {

public void sendBySMS() {
    clickElementFromlist(By.className("circle-area"),0);
       sendKeysToElement(By.id("sms"),"0506998673");

   }
    public void enterSenderName() {
        clearText(By.cssSelector("input[placeholder=\"שם שולח המתנה\"]"));
        sendKeysToElement(By.cssSelector("input[placeholder=\"שם שולח המתנה\"]"), "asaf");
    }
public void senderphonnumber(){
    sendKeysToElement(By.cssSelector("input[placeholder=\"מספר נייד\"]"),"0528354911");
}

    public void paymentSubmit() {
        clickElement(By.cssSelector("button[type=\"submit\"]"));
    }

}
