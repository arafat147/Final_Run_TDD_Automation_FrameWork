package homePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebAPI {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a") public WebElement droppablePageLinkElement;
    @FindBy(css = "div#draggable") public WebElement draggableElement;
    @FindBy(css = "div#droppable") public WebElement droppableElement;

    public void dragAndDrop() throws InterruptedException {
        droppablePageLinkElement.click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggableElement,droppableElement).build().perform();
    }

}
