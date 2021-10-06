package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidoHomePage {

    //*[@class='o-navLinkList']/li/a/span[2]   shop
    //*[@class='o-headerNavDropdown -opened']/li[1]/a   phones

  //    #filters+div>div>div:nth-child(7) div.dsa-nacTile__top+div+div+div>a  view details

   //   #trident-cta-nac  get started

    //*[@title='Build your plan']  build your plan

    @FindBy(xpath = "//*[@class='o-navLinkList']/li/a/span[2]")
    WebElement shop;


    @FindBy(xpath="//*[@class='o-headerNavDropdown -opened']/li[1]/a")
    WebElement phones;

    @FindBy(css = "#filters+div>div>div:nth-child(7) div.dsa-nacTile__top+div+div+div>a")
    WebElement viewDetails;

    @FindBy(css = "#trident-cta-nac")
    WebElement getStarted;

    @FindBy(xpath = "//*[@title='Build your plan']")
    WebElement buildYourPlan;

    WebDriver driver = null;



    public FidoHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnShop(){shop.click(); }
    public void clickOnPhones(){phones.click(); }
    public void clickOnDetails(){viewDetails.click(); }
    public void clickOnGetStarted(){getStarted.click(); }
    public void clickOnPlan(){buildYourPlan.click(); }

}
