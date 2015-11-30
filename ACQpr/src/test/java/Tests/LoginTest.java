package test.java.Tests;



import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginTest extends Fixture {


    @Test
    public void test1() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.openPage();
        ellos.mainPage.clickLogo();
        
        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField("aksdjl@mail.ru");
        ellos.loginPage.fillPasswordField("dafjhl");
        ellos.loginPage.checkIncorrectEmailOrPass();
    }
    @Test
      public void test2() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField("aksdjl@mail.ru");
        ellos.loginPage.fillPasswordField("");
        ellos.loginPage.checkEmptyEmailOrPass("*Måste ange ett lösenord.");
    }
    @Test
    public void test3() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField("");
        ellos.loginPage.fillPasswordField("123456");
        ellos.loginPage.checkEmptyEmailOrPass("*Måste ange ett användarnamn.");
    }
    @Test
    public void test4() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField("");
        ellos.loginPage.fillPasswordField("");
        ellos.loginPage.checkEmptyEmailOrPass("*Måste ange ett användarnamn.\n" +
                "*Måste ange ett lösenord.");
    }
    @Test
      public void test5() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField("@mail.ru");
        ellos.loginPage.fillPasswordField("123456");
        ellos.loginPage.checkIncorrectEmailOrPass();
    }
    @Test
      public void test6() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField("aksdjl.mail.ru");
        ellos.loginPage.fillPasswordField("123456");
        ellos.loginPage.checkIncorrectEmailOrPass();
    }
    @Test
      public void test7() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField("aksdjl@mail.ru");
        ellos.loginPage.fillPasswordField("123456");
        ellos.loginPage.checkCorrectEmailAndPass();
        // TODO can not find element!!!
    }
}
