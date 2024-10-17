package org.example.seleniumwebtests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        DesiredCapabilities cap = new DesiredCapabilities();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions()
                .addArguments("--remote-allow-origins=*")
                .addArguments("--headless")
                .setExperimentalOption("excludeSwitches",
                        List.of("disable-popup-blocking"));
        cap.setCapability(ChromeOptions.CAPABILITY, Configuration.browserCapabilities);
        open("https://the-internet.herokuapp.com/");
    }
// #content > h2
    @Test
    public void trueOpened() {
        Assertions.assertNotNull(mainPage.AvailableExamples);
        mainPage.AvailableExamples.shouldHave(text("Available Examples"));

    }
//        mainPage.searchButton.click();
//
//       // $("[data-test='site-header-search-action']").sendKeys("Selenium");
//       // $("button[data-test='full-search-button']").click();
//
//        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
//    }


    @Test
    public void search() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(currentUrl,"https://the-internet.herokuapp.com/");


    }

    @Test
    public void search2() {
        mainPage.firstLink.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(currentUrl,"https://the-internet.herokuapp.com/abtest");
        assertEquals(1,2-1);

    }
}
