package com.genericlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagefactory.Pagefactory;

public class selenium { 

	WebDriver driver;
	Pagefactory pf;
	
	public void getSetup() {
            
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadiy\\eclipse-workspace\\class1\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    pf = PageFactory.initElements(driver, Pagefactory.class);
		    driver.manage().window().maximize();
		    driver.get(pf.getUrl());
	}

	public void getLogin() {
		
		    pf.getMyaccount().click(); 
		    pf.getUsername().sendKeys(pf.getEmail());
		    pf.getPasswordbox().sendKeys(pf.getPassword());
			pf.getSignbox().click();

	}
	
	
	public void loginVerification() {
		    
		   if(driver.findElement(By.xpath("//*[contains(text(),'My Account Information')]")).getText().equalsIgnoreCase("My Account Information")) {
			 System.out.println("test pass");
		 }
		   else {
			System.out.println("test fail");
		 }
		
	}
	  	// TODO Auto-generated method stub
    
    public void tearDown() {
    	driver.quit();
    	
    }
   // WebElement myaccount = driver.findElement(By.xpath("( //*[@class='ui-button-text'])[3]"));
   // myaccount.click();
   
    
    
    
    // WebElement username= driver.findElement(By.xpath("(//*[@type='text'])[1]"));
	// username.sendKeys("omair_ny@yahoo.com");
    
    
    
    // WebElement password= driver.findElement(By.xpath("//*[@type='password']"));
	// password.sendKeys("ttjob123");
  
    
    
    
    // WebElement signin= driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]"));
	// signin.click();   
	
	 
	 //driver.quit();
	
	}


