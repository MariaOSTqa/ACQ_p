package test.java.Tests;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Samsung on 04.11.2015.
 */
public class ProductTest extends Fixture {

    @Test (enabled = false)
    public void testPr1() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.openPage();
        ellos.productPage.switchToProductPage();
        ellos.productPage.switchToLargerImage();
    }

    @Test(enabled = false)
    public void testPr2() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.productPage.switchToProductPage();
        ellos.productPage.testArticleBlackColor("ChooseSize36");
        ellos.productPage.testArticleBlackColor("ChooseSize38");
        ellos.productPage.testArticleBlackColor("ChooseSize40");
        ellos.productPage.testArticleBlackColor("ChooseSize42");
        ellos.productPage.testArticleBlackColor("ChooseSize44");
        ellos.productPage.testArticleBlackColor("ChooseSize46");
        ellos.productPage.testArticleBlackColor("ChooseSize50");
    }
    @Test(enabled = false)
    public void testPr3() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.productPage.switchToProductPage();
        ellos.productPage.testArticleBlackVine("ChooseSize34");
        ellos.productPage.testArticleBlackVine("ChooseSize36");
        ellos.productPage.testArticleBlackVine("ChooseSize38");
        ellos.productPage.testArticleBlackVine("ChooseSize40");
        ellos.productPage.testArticleBlackVine("ChooseSize42");
        ellos.productPage.testArticleBlackVine("ChooseSize44");
        ellos.productPage.testArticleBlackVine("ChooseSize46");
        ellos.productPage.testArticleBlackVine("ChooseSize50");
    }
    @Test(enabled = false)
    public void testPr4() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.productPage.switchToProductPage();

        ellos.productPage.testReviewsLink();
        ellos.productPage.testShippingLink();
        ellos.productPage.testSizeLink();
        ellos.productPage.testProductDescriptionLink();
    }
    @Test
    public void testPr5() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        ellos.mainPage.openPage();
        ellos.productPage.switchToProductPage();
        ellos.productPage.testCreditLink();
    }
    @Test
    public void testPr6() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.productPage.switchToProductPage();
        ellos.productPage.testPayLink();
    }
    @Test
    public void testPr7() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.productPage.switchToProductPage();
        ellos.productPage.testInsureLink();
    }
    @Test
    public void testPr8() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.productPage.switchToProductPage();
        ellos.productPage.testCustomerServiceLink();
    }
    }
