package search;
import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 9/2/2016.
 */
public class LoginToAccount extends Base
{
    @Test
    public void LoginAccount() throws InterruptedException
    {
        clickByXpath(".//*[@id='header-account-menu']");
        clickByXpath(".//*[@id='header-account-signin-button']");
        typeByXpath(".//*[@id='signin-loginid']","justiano@gmail.com");
        typeByXpath(".//*[@id='signin-password']","Justiano123");
        clickByXpath(".//*[@id='submitButton']");
        sleepFor(5);
    }
}
