package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateNewOrderPage;
import pages.LoginPage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class AddNewOrderSteps<CreateNewOrderPage> {
    WebDriver driver;
    LoginPage loginPage;
    CreateNewOrderPage createNewOrderPage;

    @Given("User is logged in to CodersLab shop")
    public void userIsLooggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("nnnnkkkk@nnnkkk.com", "KkkkNnn001");
    }

    @When("User selects Hummingbird Printed Sweater")
    public void userSelectsProduct() {
        createNewOrderPage.searchOurCatalog();
    }

    @And("User selects M size")
    public void userSelectsSize() {
        createNewOrderPage.setSizeSelectElement();

    }

    @And ("User selects 5 products")
    public void userSelectsFiveProducts() {
        createNewOrderPage.setAmount();

    }

    @And ("User adds products to the cart")
    public void userAddsProductsToTheCart() {
        createNewOrderPage.setAddToCartButton();

    }

    @And ("User goes to Checkout page")
    public void userGoesToCheckoutPage() {
        createNewOrderPage.setCheckoutButton();

    }

    @And ("User confirms address")
    public void userConfirmsAddress() {
        createNewOrderPage.setAddressConfirmationButton();
    }

    @And ("User selects Pick up in store option")
    public void userSelectsShippingMetod() {
        createNewOrderPage.setShippingMetod();
    }

    @And ("User selects Pay by Check option")
    public void userSelectsPaymentOption() {
        createNewOrderPage.setPaymentOption();

    }

    @And ("User clicks Order with an obligation to pay button")
    public void userClicksOrderButton() {
        createNewOrderPage.setOrderButton();
    }

    @Then ("Screen shot with order confirmation")
    public void orderConfirmationScreenShot() {
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("/screenshot.png"));

    }


}
