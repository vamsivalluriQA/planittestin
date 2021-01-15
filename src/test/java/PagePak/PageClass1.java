package PagePak;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass1 extends PageObject {


    public RemoteWebDriver driver;

    public PageClass1(RemoteWebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "#nav-logo-sprites")
    public WebElement Logo;

    @FindBy(css = "div[class='nav-line-1-container'] span[class='nav-line-1")
    public WebElement loginbtn;

    @FindBy(css = "#ap_email")
    public WebElement uid;

    @FindBy(id = "continue")
    public WebElement cntubtn;

    @FindBy(css = "#ap_password")
    public WebElement pwd;

    @FindBy(css = "#signInSubmit")
    public WebElement Signbtn;

    //public void loadLogoFrom(String filename) {
    //upload(filename).to(Signbtn);
    }

