package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SlotMachinePageObjects;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest()
    {
        //System.out.println("Opening the browser : Firefox" );
        //passing a dummy WebDriver instance;
      //  base.Stepinfo = "FirefoxDriver";
        //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Shareyalihaque\\Documents\\Selenium\\geckodriver-v0.23.0-win64");
        //Driver = new FirefoxDriver();
        String projectPath = System.getProperty("user.dir");
        System.out.println("ProjectPath : "+ projectPath);
        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
        Driver = new ChromeDriver();

        SlotMachinePageObjects searchPageObj = new SlotMachinePageObjects(Driver);

        Driver.get(projectPath);
        searchPageObj.setTextInSeachBox("combination");
        searchPageObj.clickSearchButton();
        //driver.close();
    }


    @After
    public void TearDownTest(Scenario scenario)
    {
        if(scenario.isFailed()){
            //Take the screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK" );
    }
}
