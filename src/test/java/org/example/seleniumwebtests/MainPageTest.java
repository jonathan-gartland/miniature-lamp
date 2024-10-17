package org.example.seleniumwebtests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

//    @BeforeEach
//    public void setUp() {
////        DesiredCapabilities cap = new DesiredCapabilities();
////        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
////        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*").setExperimentalOption("excludeSwitches", List.of("disable-popup-blocking"));
////        cap.setCapability(ChromeOptions.CAPABILITY, Configuration.browserCapabilities);
////        open("https://the-internet.herokuapp.com/");
//    }

    @Test
    public void search() {
       assertEquals(1,2-1);

    }
}
