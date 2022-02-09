package com.him.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class BrowserUtils {
    public WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    public String getUrl() {
        return Driver.getDriver().getCurrentUrl();
    }

    public String getTitle() {
        return Driver.getDriver().getTitle();
    }

    public void waitForVisibilityOf(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForInvisibilityOf(WebElement webElement) {
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitForClickabilityOf(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitForTitleToEqual(String expectedTitle) {
        wait.until(ExpectedConditions.titleIs(expectedTitle));
    }

    public void clickEnterOnInput(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    public String getElementsText(WebElement webElement) {
        waitForVisibilityOf(webElement);
        try {
            return webElement.getText();
        } catch (Exception e) {
            return webElement.getAttribute("value");
        }
    }

    public List<String> getElementsTexts(List<WebElement> webElements) {
        try {
            return webElements.stream().map(WebElement::getText).collect(Collectors.toList());
        } catch (Exception e) {
            return webElements.stream().map(p -> p.getAttribute("value")).collect(Collectors.toList());
        }
    }

    public void clickButton(WebElement webElement) {
        waitForClickabilityOf(webElement);
        webElement.click();
    }

    public void selectValueFromDropdown(WebElement webElement, String value) {
        waitForVisibilityOf(webElement);
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    public void fillInput(WebElement webElement, String value) {
        waitForVisibilityOf(webElement);
        webElement.click();
        webElement.clear();
        //webElement.sendKeys(Keys.chord(Keys.CONTROL, "A"));
        webElement.sendKeys(value);


    }
}

