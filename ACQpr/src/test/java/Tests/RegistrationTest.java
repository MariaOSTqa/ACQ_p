package test.java.Tests;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Samsung on 31.10.2015.
 */
public class RegistrationTest extends Fixture {
    @Test
    public void testR1() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.openPage();
        ellos.mainPage.clickLogo();

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola25@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola25@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("123456");
        ellos.registrationPage.fillRepeatRegistrationPassword("123456");

        ellos.registrationPage.checkCorrectFields();
        ellos.mainPage.switchLogOut();
    }
    @Test
    public void testR2() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola13@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola13@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("123456");
        ellos.registrationPage.fillRepeatRegistrationPassword("123456");

        ellos.registrationPage.checkInCorrectFields("* E-postadressen är redan registerad.");

    }
    @Test
    public void testR3() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola55@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola55@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("");
        ellos.registrationPage.fillRepeatRegistrationPassword("");

        ellos.registrationPage.checkEmptyFields("*Du har inte valt ett lösenord.\n" +
                "*Bekräfta lösenord");
    }

    @Test
    public void testR4 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("qwerty");
        ellos.registrationPage.fillRepeatRegistrationPassword("qwerty");

        ellos.registrationPage.checkInCorrectFields("* Felaktig e-postadress");
    }

    @Test
    public void testR5 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola66mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola66mail.ru");
        ellos.registrationPage.fillRegistrationPassword("qwerty");
        ellos.registrationPage.fillRepeatRegistrationPassword("qwerty");

        ellos.registrationPage.checkInCorrectFields("* Felaktig e-postadress");

    }
    @Test
    public void testR6 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("");
        ellos.registrationPage.fillRepeatRegistrationEmail("");
        ellos.registrationPage.fillRegistrationPassword("");
        ellos.registrationPage.fillRepeatRegistrationPassword("");

        ellos.registrationPage.checkEmptyFields("*Vänligen kontrollera stavningen i din e-postadress och försök igen.\n" +
                "*Bekräfta e-post\n" +
                "*Du har inte valt ett lösenord.\n" +
                "*Bekräfta lösenord");

    }
    @Test
    public void testR7 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("");
        ellos.registrationPage.fillRepeatRegistrationEmail("");
        ellos.registrationPage.fillRegistrationPassword("");
        ellos.registrationPage.fillRepeatRegistrationPassword("123456");

        ellos.registrationPage.checkEmptyFields("*Vänligen kontrollera stavningen i din e-postadress och försök igen.\n"+
                "*Bekräfta e-post\n"+
                "*Du har inte valt ett lösenord.");

    }
    @Test
    public void testR8 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{
        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("");
        ellos.registrationPage.fillRepeatRegistrationEmail("");
        ellos.registrationPage.fillRegistrationPassword("123456");
        ellos.registrationPage.fillRepeatRegistrationPassword("");

        ellos.registrationPage.checkEmptyFields("*Vänligen kontrollera stavningen i din e-postadress och försök igen.\n" +
                "*Bekräfta e-post\n" +
                "*Bekräfta lösenord");

    }
    @Test
    public void testR9 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola13@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("");
        ellos.registrationPage.fillRepeatRegistrationPassword("");

        ellos.registrationPage.checkEmptyFields("*Vänligen kontrollera stavningen i din e-postadress och försök igen.\n"+
                "*Du har inte valt ett lösenord.\n"+
                "*Bekräfta lösenord");

    }
    @Test
    public void testR10 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola13@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("");
        ellos.registrationPage.fillRegistrationPassword("");
        ellos.registrationPage.fillRepeatRegistrationPassword("");

        ellos.registrationPage.checkEmptyFields("*Bekräfta e-post\n"+
                "*Du har inte valt ett lösenord.\n"+
                "*Bekräfta lösenord");

    }
    @Test
    public void testR11 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola13@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola13@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("12345");
        ellos.registrationPage.fillRepeatRegistrationPassword("");

        ellos.registrationPage.checkEmptyFields("*Bekräfta lösenord");

    }
    @Test
    public void testR12 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola13@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("qwerty");
        ellos.registrationPage.fillRepeatRegistrationPassword("qwerty");

        ellos.registrationPage.checkInCorrectFields("* E-post och bekräfta e-post överensstämmer inte");

    }
    @Test
    public void testR13 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola111@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola111@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("123456");
        ellos.registrationPage.fillRepeatRegistrationPassword("123356");

        ellos.registrationPage.checkInCorrectFields("* Lösenord och bekräfta lösenord överensstämmer inte");

    }
    @Test
    public void testR14 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola106@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola106@mail.ru");
        ellos.registrationPage.fillRegistrationPassword("qwy");
        ellos.registrationPage.fillRepeatRegistrationPassword("qwy");

        ellos.registrationPage.checkInCorrectFields("* Lösenordet måste innehålla minst 4 tecken.");

    }
    @Test
    public void testR15 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola16mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola16mail.ru");
        ellos.registrationPage.fillRegistrationPassword("qwerty");
        ellos.registrationPage.fillRepeatRegistrationPassword("qwyy");

        ellos.registrationPage.checkInCorrectFields("* Lösenord och bekräfta lösenord överensstämmer inte\n" +
                "* Felaktig e-postadress");

    }
    @Test
    public void testR16 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola66@mail.ru");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola66mail.ru");
        ellos.registrationPage.fillRegistrationPassword("123456");
        ellos.registrationPage.fillRepeatRegistrationPassword("123466");

        ellos.registrationPage.checkInCorrectFields("* E-post och bekräfta e-post överensstämmer inte\n" +
                "* Lösenord och bekräfta lösenord överensstämmer inte");

    }
    @Test
    public void testR17 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola66@mail");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola66mail.ru");
        ellos.registrationPage.fillRegistrationPassword("123");
        ellos.registrationPage.fillRepeatRegistrationPassword("1234");

        ellos.registrationPage.checkInCorrectFields("* E-post och bekräfta e-post överensstämmer inte\n"+
        "* Lösenord och bekräfta lösenord överensstämmer inte\n"+
        "* Felaktig e-postadress\n"+
                "* Lösenordet måste innehålla minst 4 tecken.");

    }
    @Test
    public void testR18 () throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException{

        ellos.mainPage.switchToLoginPage();

        ellos.registrationPage.fillRegistrationEmail("lola66@mail");
        ellos.registrationPage.fillRepeatRegistrationEmail("lola66mail.ru");
        ellos.registrationPage.fillRegistrationPassword("12356");
        ellos.registrationPage.fillRepeatRegistrationPassword("125534");

        ellos.registrationPage.checkInCorrectFields("* E-post och bekräfta e-post överensstämmer inte\n"+
        "* Lösenord och bekräfta lösenord överensstämmer inte\n"+
        "* Felaktig e-postadress");

    }
}
