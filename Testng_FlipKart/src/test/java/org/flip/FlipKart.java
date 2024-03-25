package org.flip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipKart extends BaseMethod {

	@BeforeClass
	private void beforeclass() {
		browserlaunch("chrome");
		implicitlyWait(20);
	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("before" + new Date());
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("before" + new Date());
	}

	@Test
	private void test() throws InterruptedException {
		geturl("https://www.flipkart.com/");
		LoginPage l = new LoginPage();
		sendkeys(l.getUser(), "9514391536");
		sendkeys(l.getPass(), "anil123654");
		click(l.getSubmite());
		Thread.sleep(2000);
		sendkeys(l.getSearch(), "iphone");
		click(l.getSubmite2());
		List<WebElement> text = l.text();
		
		for (int i = 0; i < text.size(); i++) {
			String text2 = text.get(i).getText();

		}
		List<WebElement> price1 = l.getPrice1();
	//	List<Integer> li = new ArrayList<>();
		 
		for (int i = 0; i < price1.size(); i++) {
			String text1 = price1.get(i).getText();
			if (text1.contains("₹")) {
				text1 = text1.replaceAll("₹", "");
			}
			if (text1.contains(",")) {
				text1 = text1.replaceAll(",", "");
				// System.out.println(text1);
				
				
			}
			int parseInt = Integer.parseInt(text1);
			System.out.println(parseInt);
               
			// String string = Integer.toString(parseInt);
		//	li.add(parseInt);

		}
//		Collections.sort(li);
//		System.out.println(li);
//		Collections.reverse(li);
//		System.out.println("reverse" + li);
		
		for (int i = 0; i <18 ; i++) {
			Thread.sleep(5000);
			click(l.getNext());}
			
		
		}
		
		}


	
		
		
	