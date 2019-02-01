package com.mainmethod;

import com.genericlibrary.selenium;

public class mainmethodtest extends selenium {

	public static void main(String[] args) {
		
		/*
		 * selenium obj = new selenium(); obj.getSetup(); obj.getLogin();
		 * obj.loginVerification(); obj.tearDown();
		 */
		
		mainmethodtest obj = new mainmethodtest();
	    obj.getSetup();
	    obj.getLogin();
	    obj.loginVerification();
	    obj.tearDown();
		
	}

}
