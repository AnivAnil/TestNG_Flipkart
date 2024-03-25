package org.flip;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseMethod{
public LoginPage() {
PageFactory.initElements(driver,this);
}

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement user ;

@FindBy(xpath="//input[@type=\"password\"]")
private WebElement pass ;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement submite ;

@FindBy(name="q")
private WebElement search ;

@FindBy(xpath="//button[@type='submit']")
private WebElement submite2 ;

@FindBy(xpath="//div[@class='_4rR01T']")
private WebElement iphone ;

@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
private WebElement price ;

@FindBy(xpath="//div[@class='_4rR01T']")
private List<WebElement> text ;

@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
private List<WebElement> price1 ;

@FindBy(xpath="//span[text()='Next']")
private WebElement next ;









public WebElement getNext() {
	return next;
}

public List<WebElement> getText() {
	return text;
}

public List<WebElement> getPrice1() {
	return price1;
}

public List<WebElement> text() {
	return text;
}

public WebElement getIphone() {
	return iphone;
}

public WebElement getPrice() {
	return price;
}

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getSubmite() {
	return submite;
}

public WebElement getSearch() {
	return search;
}

public WebElement getSubmite2() {
	return submite2;
}


}
