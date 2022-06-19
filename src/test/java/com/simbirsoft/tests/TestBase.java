package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://demoqa.com";
    }
}
