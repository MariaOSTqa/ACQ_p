package main.java.ua.artcode.week3.day1.Pages;

import org.testng.Assert;
import ua.artcode.week3.day1.utils.WebDriverWrapper;

import java.io.IOException;

/**
 * Created by Samsung on 04.11.2015.
 */
public class ProductPage extends Page {
    private static final String PRODUCT_PAGE = "http://www.ellos.se/ellos-collection/kappa-med-dragkedja/484685?selArt=390395";

    public ProductPage(WebDriverWrapper driver) {
        super(driver, PRODUCT_PAGE);
    }

    public void switchToProductPage() throws IOException {
        driverWrapper.get(PRODUCT_PAGE);
        String title = "Ellos Collection Kappa med dragkedja i färgerna Svart, Vinmelange inom Dam - Ellos.se";
        if (title.equals(getTitle())) {
            log.info("SwitchTo Product Page was correct");
        } else {
            log.error("SwitchTo Product Page was Incorrect");
            Assert.fail("Transition to the Product Page is not successful");
        }
    }

    public void switchToLargerImage() throws IOException {
        web.clckLink("LargerImageLink");
        if (web.isElementPresent("LargerImage")) {
            log.info("SwitchTo Larger Image was correct");
        } else {
            log.error("SwitchTo Larger Image was Incorrect");
        }
        Assert.assertTrue(web.isElementPresent("LargerImage"), "Incorrect work zoom form");
    }

    public void testArticleBlackColor (String loc) throws IOException {
        String article = "398-4006";
        web.clckLink("FieldColorButton");
        web.clckLink("ChooseColorSvart");
        web.clckLink("FieldSizeButton");
        web.clckLink(loc);
        if (article.equals(web.getElText("Article"))) {
            log.info("The correct product number for ColorSvart");
        } else {
            log.error("The Incorrect product number for ColorSvart");
            Assert.fail("Incorrect work display Product number for ColorSvart");
        }
    }
    public void testArticleBlackVine (String loc) throws IOException {
        String article = "398-4014";
        web.clckLink("FieldColorButton");
        web.clckLink("ChooseColorVinmelange");
        web.clckLink("FieldSizeButton");
        web.clckLink(loc);
        if (article.equals(web.getElText("Article"))) {
            log.info("The correct product number for ColorVinmelange");
        } else {
            log.error("The Incorrect product number for ColorVinmelange");
            Assert.fail("Incorrect work display Product number for ColorVinmelange");
        }
    }

    public void testProductDescriptionLink () throws IOException {
        web.clckLink("ProductDescriptionLink");
        if (web.isElementPresent("ProductDescriptionText")) {
            log.info("The correct ProductDescription");
        } else {
            log.error("The Incorrect ProductDescription");
        }Assert.assertTrue(web.isElementPresent("ProductDescriptionText"), "ProductDescriptionLink work correct");
    }
    public void testReviewsLink () throws IOException {
        web.clckLink("ReviewsLink");
        if (web.isElementPresent("ReviewsText")) {
            log.info("The correct ReviewsLink");
        } else {
            log.error("The Incorrect ReviewsLink");
        }Assert.assertTrue(web.isElementPresent("ReviewsText"), "ReviewsLink work correct");
    }
    public void testShippingLink () throws IOException {
        web.clckLink("ShippingLink");
        if (web.isElementPresent("ShippingText")) {
            log.info("The correct ShippingLink");
        } else {
            log.error("The Incorrect ShippingLink");
        }Assert.assertTrue(web.isElementPresent("ShippingText"), "ShippingLink work correct");
    }
    public void testSizeLink () throws IOException {
        web.clckLink("SizeLink");
        if (web.isElementPresent("SizeText")) {
            log.info("The correct SizeLink");
        } else {
            log.error("The Incorrect SizeLink");
        }Assert.assertTrue(web.isElementPresent("ProductDescriptionText"), "SizeLink work correct");
    }
    public void testCreditLink () throws IOException {
        web.clckLink("CreditPayInsureLink");
        String text = "Ellos Privatlån";
        web.clckLink("CreditLink");
        if (text.equals(web.getElText("CreditPage"))) {
            log.info("Switching to CreditPage successfully");
        } else {
            log.error("Switching to CreditPage incorrect");
            Assert.fail("Error in open CreditPage");
        }
    }
    public void testPayLink () throws IOException {
        web.clckLink("CreditPayInsureLink");
        String text = "Fyra sätt att betala";
        web.clckLink("PayLink");
        if (text.equals(web.getElText("PayPage"))) {
            log.info("Switching to PayPage successfully");
        } else {
            log.error("Switching to PayPage incorrect");
            Assert.fail("Error in open PayPage");
        }
    }
    public void testInsureLink () throws IOException {
        web.clckLink("CreditPayInsureLink");
        String text = "Försäkringar";
        web.clckLink("InsureLink");
        if (text.equals(web.getElText("InsurePage"))) {
            log.info("Switching to InsurePage successfully");
        } else {
            log.error("Switching to InsurePage incorrect");
            Assert.fail("Error in open InsurePage");
        }
    }

    public void testCustomerServiceLink () throws IOException {
        web.clckLink("CustomerServiceLink");
        if (web.isElementPresent("CustomerServiceLogo")) {
            log.info("Switching to CustomerServicePage successfully");
        } else {
            log.error("Switching to CustomerServicePage incorrect");
            Assert.fail("Error in open CustomerServicePage");
        }
    }
}
