package main.java.ua.artcode.week3.day1.Pages;

import org.testng.Assert;
import ua.artcode.week3.day1.utils.WebDriverWrapper;

import java.io.IOException;

/**
 * Created by Samsung on 31.10.2015.
 */
public class Registration extends Page {
    public Registration(WebDriverWrapper driver) throws Exception{
        super(driver);
    }

    public void fillRegistrationEmail(String inputData) throws IOException {
        web.input("RegistrationEmail", inputData);
    }

    public void fillRepeatRegistrationEmail(String inputData) throws IOException {
        web.input("RegistrationRepeatEmail", inputData);
    }
    public void fillRegistrationPassword(String inputData) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        web.clckLink("RegistrationPass");
        web.input("RegistrationPassInput", inputData);
    }

    public void fillRepeatRegistrationPassword(String inputData) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        web.clckLink("RegistrationRepeatPass");
        web.input("RegistrationRepeatPassInput", inputData);
    }
    public void checkCorrectFields() throws IOException {
        web.clckLink("RegistrationButton");

        if (web.isElementPresent("RegistrationSuccess")) {
            log.info("Registration Fields are working correctly");
        } else {

            log.error("Registration Fields are not working correctly");
        }
        Assert.assertTrue(web.isElementPresent("RegistrationSuccess"), "Incorrect work login form");
    }
    public void checkInCorrectFields(String text) throws IOException {
        web.clckLink("RegistrationButton");

        if (text.equals(web.getElText("InvalidRegistration"))) {
            log.info("Registration: Correct error message");
        } else {
            log.error("Registration: Incorrect error message");
        Assert.fail("Incorrect error when i try InCorrectFields");}
    }

    public void checkEmptyFields(String text) throws IOException {
        web.clckLink("RegistrationButton");

        if (text.equals(web.getElText("EmptyRegFields"))) {
            log.info("Registration: Correct error message");
        } else {
            log.error("Registration: Incorrect error message");
        Assert.fail("Incorrect error when i try EmptyFields");}
    }
}





