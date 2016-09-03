package search;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 9/2/2016.
 */
public class CreateAccount extends Base{
    @Test
    public void CreatingAccount()throws InterruptedException
    {
        clickByXpath(".//*[@id='header-account-menu']");
        clickByXpath(".//*[@id='header-account-register']/span");
        typeByXpath(".//*[@id='create-account-firstname']","John");
        typeByXpath(".//*[@id='create-account-lastname']","Justiano");
        typeByXpath(".//*[@id='create-account-emailId']","justiano@gmail.com");
        typeByXpath(".//*[@id='create-account-password']","Justiano123");
        typeByXpath(".//*[@id='create-account-confirm-password']","Justiano123");
        clickByXpath(".//*[@id='create-account-expedia-policy-label']/span");
        clickByXpath(".//*[@id='create-account-submit-button']");
        sleepFor(15);


    }
}
