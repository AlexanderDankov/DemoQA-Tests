package com.simbirsoft.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {

    private SelenideElement dateOfBirthInput =  $("input#dateOfBirthInput"),
                            monthSelect = $(".react-datepicker__month-select"),
                            yearSelect = $(".react-datepicker__year-select");
    private ElementsCollection daySelect = $$(".react-datepicker__day");

    public void setDate(String day, String month, String year) {
        dateOfBirthInput.click();
        monthSelect.selectOptionByValue(month);
        yearSelect.selectOptionByValue(year);
        daySelect.findBy(Condition.text(day)).click();
    }
}