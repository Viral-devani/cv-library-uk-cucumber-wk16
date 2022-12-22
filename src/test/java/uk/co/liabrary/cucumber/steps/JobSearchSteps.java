package uk.co.liabrary.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.liabrary.pages.Homepage;
import uk.co.liabrary.pages.ResultPage;

public class JobSearchSteps {
    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new Homepage().setAcceptCookies();
    }

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter \"([^\"]*)\" job title field$")
    public void iEnterJobTitleField(String title)  {
        new Homepage().enterJobTitle(title);

    }

    @And("^I enter \"([^\"]*)\" in the location field$")
    public void iEnterInTheLocationField(String location)  {
        new Homepage().enterLocation(location);

    }

    @And("^I select \"([^\"]*)\" in the distance field$")
    public void iSelectInTheDistanceField(String distance)  {
        new Homepage().selectDistance(distance);

    }

    @And("^I click on the More Search Option Link$")
    public void iClickOnTheMoreSearchOptionLink() {
        new Homepage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter \"([^\"]*)\" data in the minimum salary field$")
    public void iEnterDataInTheMinimumSalaryField(String mSalary)  {
        new Homepage().enterMinSalary(mSalary);

    }

    @And("^I enter \"([^\"]*)\" data in the maximum salary field$")
    public void iEnterDataInTheMaximumSalaryField(String maxSalary)  {
        new Homepage().enterMaxSalary(maxSalary);

    }

    @And("^I select the \"([^\"]*)\" salary type$")
    public void iSelectTheSalaryType(String salaryType)  {
        new Homepage().selectSalaryType(salaryType);

    }

    @And("^I select the \"([^\"]*)\" job type$")
    public void iSelectTheJobType(String jobType)  {
        new Homepage().selectJobType(jobType);
    }

    @And("^I click on the Find Jobs Button$")
    public void iClickOnTheFindJobsButton() {
        new Homepage().clickOnFindJobsButton();
    }

    @And("^I verify the Result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result)  {
        new ResultPage().verifyTheResults(result);

    }

    @Then("^I am able to search jobs successfully$")
    public void iAmAbleToSearchJobsSuccessfully() {
    }


}
