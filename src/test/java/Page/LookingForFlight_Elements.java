package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LookingForFlight_Elements {

    public LookingForFlight_Elements(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@id='search_cheap_one_way_button']")
    public WebElement oneWayButton;

    @FindBy(xpath = "//div[@id='search_cheap_flight_from_arrow_icon']")
    public WebElement fromButton;

    @FindBy(xpath = "//div[@class='nxm-360-search-select-airpot-list-area-port'][normalize-space()='Aalborg']")
    public WebElement clickAolborg;

    @FindBy(xpath = "//input [@id ='arrival-input']")
    public WebElement toButton;

    @FindBy(xpath = "//div[@id='search_cheap_flight_to_arrow_icon']")
    public WebElement clickAnkara;




}
