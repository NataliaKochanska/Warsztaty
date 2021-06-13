package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrderPage {
    private static WebDriver driver;

    public CreateNewOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "s")
    WebElement searchOurCatalog;

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/button")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id="js-product - list"]/div[1]/article[1]/div/div[1]/h2/a")
    WebElement hummingbirdPrintedSweater;

    @FindBy(id = "group_1")
    WebElement sizeSelectElement;
    Select size = new Select(sizeSelectElement);
    size.selectByVisibleText("M");

    @FindBy(xpath = "//*[@id="add-to - cart - or - refresh"]/div[2]/div/div[1]/div/span[3]/button[1]/i")
    WebElement amount;

    @FindBy(xpath = "//*[@id="add-to-cart-or-refresh"]/div[2]/div/div[2]/button")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id="blockcart-modal"]/div/div/div[2]/div/div[2]/div/div/a")
    WebElement checkoutButton;

    @FindBy(xpath = "//*[@id="main"]/div/div[2]/div[1]/div[2]/div/a")
    WebElement proceedToCheckoutButton;

    @FindBy(name = "confirm-addresses")
    WebElement addressConfirmationButton;

    @FindBy(xpath = "//*[@id="js-delivery"]/div/div[1]/div[1]/div/span/span")
    WebElement shippingMetod;

    @FindBy(name = "confirmDeliveryOption")
    WebElement confirmDeliveryOption;

    @FindBy(id = "payment-option-1")
    WebElement paymentOption;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement agreeToTheTermsButton;

    @FindBy(className = "btn btn-primary center-block")
    WebElement orderButton;

    public void searchOurCatalog() {
        searchOurCatalog.click();
        searchOurCatalog.clear();
        searchOurCatalog.sendKeys("Hummingbird Printed Sweater");
        searchButton.click();
        hummingbirdPrintedSweater.click();
    }

    public void setSizeSelectElement() {
        sizeSelectElement.click();
    }

    public void setAmount() {
        amount.click();
        amount.click();
        amount.click();
        amount.click();
        amount.click();
    }

    public void setAddToCartButton() {
        addToCartButton.click();
    }

    public void setCheckoutButton() {
        checkoutButton.click();
        proceedToCheckoutButton.click();
    }

    public void setAddressConfirmationButton() {
        addressConfirmationButton.click();
    }

    public void setShippingMetod() {
        shippingMetod.click();
        confirmDeliveryOption.click();
    }

    public void setPaymentOption() {
        paymentOption.click();
        agreeToTheTermsButton.click();
    }

    public void setOrderButton() {
        orderButton.click();
    }


}
