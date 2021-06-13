package stepsdefinition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateNewAddressPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class AddNewAddressSteps {
        WebDriver driver;
        LoginPage loginPage;
        CreateNewAddressPage createNewAddressPage;

        @Given("User is logged in to CodersLab shop")
            public void userIsLooggedInToCodersLabShop(){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.loginAs("nnnnkkkk@nnnkkk.com", "KkkkNnn001");
        }

        @When("User goes to \"Address\" page")
            public void userGoesToAddressPage() {
            driver.get("https://prod-kurs.coderslab.pl/index.php?controller=addresses");
        }

        @And("User goes to \"Create new address\" page")
            public void userGoesToCreateNewAddressPage() {
            createNewAddressPage.createNewAddressButton();
        }

        @And("keywords <alias>, <address>, <city>, <postcode>, <phone> are entered in input fields")
           public void CreateNewAddressPage(String alias, String address, String city, String postcode, String phone) {
            createNewAddressPage.createNewAlias(alias);
            createNewAddressPage.createNewAddress(address);
            createNewAddressPage.createNewCity(city);
            createNewAddressPage.createNewPostCode(postcode);
            createNewAddressPage.countrySelectElement();
            createNewAddressPage.createNewPhone(phone);
        }


        @Then("new address is saved and correct")
            public void saveButton() {
                createNewAddressPage.saveButton();
            }



}

