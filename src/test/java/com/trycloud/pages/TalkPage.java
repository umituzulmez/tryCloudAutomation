package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage  extends BasePage{

    public TalkPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//div[@class='icon-loading-small-dark'])[4]")
    public WebElement TalkModuleButton;

    @FindBy(xpath = "//*[@id=\"spreedme-room-list\"]/li[3]/div[1]/ul/li/button")
    public WebElement ThreeDots;

    @FindBy(xpath = "//*[@id=\"spreedme-room-list\"]/li[3]/div[2]/ul/li[1]/button/span[2]")
    public WebElement AddToFavorites;

}
