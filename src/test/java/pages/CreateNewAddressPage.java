package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAddressPage {

    private static WebDriver driver;
    public CreateNewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/a/span")
    WebElement createNewAddressButton;

    @FindBy(name = "alias")
    WebElement aliasInput;

    @FindBy(name = "address1")
    WebElement addressInput;

    @FindBy(name = "city")
    WebElement cityInput;

    @FindBy(name = "postcode")
    WebElement postcodeInput;

    @FindBy(name = "id_country")
    WebElement countrySelectElement;
    Select country = new Select(countrySelectElement);
    country.selectByVisibleText("United Kingdom");

    @FindBy(name = "phone")
    WebElement phoneInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    WebElement saveButton;

    public void createNewAddressButton() {
        createNewAddressButton.click();
    }


    public void createNewAlias(String alias) {
        aliasInput.click();
        aliasInput.clear();
        aliasInput.sendKeys(alias);
    }

    public void createNewAddress(String address) {
        addressInput.click();
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void createNewCity(String city) {
        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    public void createNewPostCode(String postcode) {
        postcodeInput.click();
        postcodeInput.clear();
        postcodeInput.sendKeys(postcode);
    }

    public void countrySelectElement() {
        countrySelectElement.click();
    }
    public void createNewPhone(String phone) {

        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }

    public void saveButton() {
        saveButton.click();
    }
}
