package search;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Shakir on 9/3/2016.
 */
public class CruisesBooking extends Base
{
    @Test
    public void BookCruise() throws InterruptedException
    {
        clickByXpath(".//*[@id='primary-header-cruise']");
        clickByXpath(".//*[@id='cruise-destination']");
        selectOptionByVisibleText("cruise-destination","Bermuda");
         new Select(driver.findElement(By.id("#cruise-destination"))).selectByVisibleText("Bermuda");
        typeByXpath(".//*[@id='cruise-departing']","10/28/2016");
        typeByXpath(".//*[@id='cruise-returning']","11/01/2016");
        clickByXpath(".//*[@id='search-button']");
        sleepFor(5);

    }
}
