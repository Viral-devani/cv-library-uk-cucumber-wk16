package uk.co.liabrary.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.liabrary.utility.Utility;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;


    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDroppdown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOption;

    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @FindBy(xpath = "(//select[@id='salarytype'])[1]")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "(//select[@id='tempperm'])[1]")
    WebElement jobTypeDropDown;

    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;

    public void enterJobTitle(String jobTitles) {
        log.info("Entering Job Title " + jobTitle.toString());
        sendTextToElement(jobTitle, jobTitles);

    }

    public void enterLocation(String locations) {
        log.info("Entering Location " + location.toString());
        sendTextToElement(location, locations);

    }

    public void selectDistance(String distance) {
        log.info("Selecting Distance " + distanceDroppdown.toString());
        selectByVisibleTextFromDropDown(distanceDroppdown, distance);


    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Clicking on more search Option Link " + moreSearchOption.toString());
        clickOnElement(moreSearchOption);

    }

    public void enterMinSalary(String minSalary) {
        log.info("Entering Minimum Salary " + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);

    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Entering Max Salary " + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryType(String sType) {
        log.info("Selecting Salary Type " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);


    }

    public void selectJobType(String jobType) {
        log.info("Selecting Job Type " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }

    public void clickOnFindJobsButton() {
        log.info("Clicking on find jobs button " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);

    }

    public void setAcceptCookies() {

        // driver.switchTo().frame(iframe);
        switchToIframe(iframe);
        System.out.println("we are switching to iFrame");
        clickOnElement(acceptCookies);//click on Acceptall
        System.out.println("We are done with iFrame");

        driver.switchTo().defaultContent();//switch to default window
    }


}
