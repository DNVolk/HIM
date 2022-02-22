package com.him.utilities;

import com.him.google.pages.ApplePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BrowserUtils {
    public WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    /**
     * Switches to new window by the exact title. Returns to original window if target title not found
     * @param targetTitle
     */
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    /**
     * Moves the mouse to given element
     *
     * @param element on which to hover
     */
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * return a list of string from a list of elements
     *
     * @param list of webelements
     * @return list of string
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

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

    /**
     * waits for backgrounds processes on the browser to complete
     *
     * @param timeOutInSeconds
     */
    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

