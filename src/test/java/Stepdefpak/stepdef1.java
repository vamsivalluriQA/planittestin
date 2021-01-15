package Stepdefpak;

import PagePak.PageClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class stepdef1 extends ScenarioSteps{

    //Declare objects to Page classes and other required classes
    public PageClass1 pageobj;
    public Shared sh;
    public WebDriverWait w;

    //Constructor method
    public stepdef1 (Shared sh)
    {
        this.sh=sh;
    }

    @Test

    @Step
    @Given ("launch site using (.*)$")
    public void launch_site(String bn)
    {
        //open browser
        sh.driver=sh.tu.openBrowser(bn);
        pageobj=new PageClass1(sh.driver);
        Integer t=Integer.parseInt((String) sh.p.get("maxtime"));
        w=new WebDriverWait(sh.driver,t);
        //launch site
        sh.tu.launchSite(sh.p.getProperty("url"));
    }
    @Step
    @Then("^logo should available$")
    public void logo_should_available()
    {
        w.until(ExpectedConditions.visibilityOf(pageobj.Logo));
        if(pageobj.Logo.isDisplayed())
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    @Step
    @When("^Click on Login button$")
    public void click_login_buttion()
    {
        pageobj.loginbtn.click();
    }
    @Step
    @Then("userid should be visible$")
    public void userid_should_be_visible()
    {
        pageobj.uid.isDisplayed();
    }
    @Step
    @When("Login with given credentials \"(.*)\",\"(.*)\"$")
    public void Login_with_given_credentials(String uid, String Pwd) throws Exception {
        pageobj.uid.sendKeys(uid);
        Thread.sleep(3000);
        pageobj.cntubtn.click();
        pageobj.pwd.sendKeys(Pwd);
        pageobj.Signbtn.click();
        //waitForAbsenceOf("#popup");0
    }
    @Step
    @Then("Validate the user account $")
    public void Validate_the_user_account()
    {
        String name=pageobj.loginbtn.getText();
    }

}
