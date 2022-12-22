package uk.co.liabrary.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.liabrary.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public void Resultpage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyTheResults(String expected){
        log.info("verifying the results "+resultText.toString());
        VerifyElements(resultText, expected, "Results are displayed incorrectly");

    }
}

