package main.java.ua.artcode.week3.day1.Pages;


import org.testng.Assert;
import ua.artcode.week3.day1.utils.WebDriverWrapper;
import ua.artcode.week3.day1.utils.WebElementsActions;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginPage extends Page {

    public LoginPage(WebDriverWrapper driver) throws Exception {
        super(driver);
    }

    public void fillEmailField(String inputData) throws IOException {
        web.input("EmailField", inputData);
    }


    public void fillPasswordField(String inputData) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        web.clckLink("PassField");
        //web.waitForElementPresent("PassField");
        //System.out.println(web.isElementPresent("PassField"));
        //System.out.println(driver.findElement(ui("PassField")).isEnabled());
        web.inputWithoutCleaning("PassFieldInput", inputData);
    }

    public void checkCorrectEmailAndPass() throws IOException {
        web.clckLink("LoginButton");

        if (web.isElementPresent("LoginSuccess")) {
            log.info("Field Username and password are working correctly");
        } else {
            log.error("Field Username and password are not working correctly");
        }
        Assert.assertTrue(web.isElementPresent("LoginSuccess"), "Incorrect work login form");
    }

   public void checkIncorrectEmailOrPass() throws IOException {
       web.clckLink("LoginButton");
       if (web.isElementPresent("InvalidEmailOrPass")) {
           log.info("Correct error message");
        } else {
           log.error("Incorrect error message");
            Assert.fail("Incorrect error when i try InvalidEmailOrPass");
        }

        //or Assert.assertTrue(web.isElementPresent(ERROR_LOCATOR), "Incorrect error when i try sdfvdfv");
   }

    public void checkEmptyEmailOrPass(String text) throws IOException {
        web.clckLink("LoginButton");

        if (text.equals(web.getElText("EmptyEmailOrPass"))) {
            log.info("Correct error message");
        } else {
            log.error("Incorrect error message");
            Assert.fail("Incorrect error when i try EmptyEmailOrPass");
        }

        //or Assert.assertTrue(web.isElementPresent(ERROR_LOCATOR), "Incorrect error when i try sdkjfvdfv");
    }

}
