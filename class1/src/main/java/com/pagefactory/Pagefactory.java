package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class Pagefactory {
	
	private String url = "http://www.gcrit.com/build3/";
	
	@FindBy(xpath="( //*[@class='ui-button-text'])[3]")
	private WebElement myaccount;
	
	@FindBy(xpath="(//*[@type='text'])[1]")
	private WebElement username;
	
	private String email= "omair_ny@yahoo.com";
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement passwordbox;
	
	private String password = "ttjob123";
	
	@FindBy(xpath="(//*[@class='ui-button-text'])[5]")
	private WebElement signbox; 
	

    
	public String getUrl() {
		return url;
	}


	public WebElement getMyaccount() {
		return myaccount;
	}

 
	public WebElement getUsername() {
		return username;
	}


	public String getEmail() {
		return email;
	}


	public WebElement getPasswordbox() {
		return passwordbox;
	}


	public String getPassword() {
		return password;
	}


	public WebElement getSignbox() {
		return signbox;
	}
	
	
	
	
	
	

}
