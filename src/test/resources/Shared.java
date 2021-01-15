package Stepdefpak;

import Drivers.webdrivers;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileReader;
import java.util.Properties;

public class Shared {


    //Global object related to all step definition classes
    public String projectpath;
    public RemoteWebDriver driver; //SWD class
    public Scenario s; //cucumber-java class
    public Properties p; //JDK class
    public webdrivers tu;

    //method to be executed before for every "Scenario:" or "Scenario Outline:" iterations
    @Before
    public void method1(Scenario s) throws Exception
    {
        //define driver object as null by default
        driver=null;
        //Create "Scenario" class object to work for current "Scenario:" or "Scenario Outline:"
        this.s=s;
        //Load properties file
        projectpath=System.getProperty("user.dir");
        FileReader fr=new FileReader(projectpath+
                "\\src\\test\\resources\\properties\\reusabledata.properties");
        p=new Properties();
        p.load(fr);
        //Create object to TestUtility class
        tu=new webdrivers();
    }



}
