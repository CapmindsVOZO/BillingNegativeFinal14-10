package com.BillingNegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class BillingNergativeCases extends Base_class{

	public static WebDriver driver = getbrowser("firefox");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {


	
//	@Test(priority = 0)
//
//	public void BillingNergativeCasess() throws InterruptedException {	
		// Driver Maximize and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz:444/");

		// Enter Username
		sendkeys(pom.getinstance().getUsername(), "Admin3");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "Admin@123");
			
		// Click Signin Button '
        Clickonelement(pom.getinstance().getSigninbtn());
       
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     	
        // click patient
     	Clickonelement(pom.getBillingNergativeCases().getClickBillingModule());

     	Thread.sleep(8000);
     	 // click patient payment
     	Clickonelement(pom.getBillingNergativeCases().getClickPatientPayment());

     	 // click pay
     	Clickonelement(pom.getBillingNergativeCases().getClickPay());

     	//enter Amount
		sendkeys(pom.getBillingNergativeCases().getEnterAmount(), "1000");
     	
		 // click add payment
     	Clickonelement(pom.getBillingNergativeCases().getClickaddPayment());
     	
     // click cancel
     	Clickonelement(pom.getBillingNergativeCases().getClickcancel());
     	
     	Thread.sleep(5000);
     	// click patient payment
     	Clickonelement(pom.getBillingNergativeCases().getClickPatientPayment1());
     	
     	//enter Amount
     	sendkeys(pom.getBillingNergativeCases().getEnterName(), "Daniel ");
     	Thread.sleep(6000);
     	
     	// select   patient name
     	Clickonelement(pom.getBillingNergativeCases().getselectname());
     	
     	// click  pay
     	Clickonelement(pom.getBillingNergativeCases().getClickpay());
     	
     	Thread.sleep(4000);
     	
     	 // click cancel
     	Clickonelement(pom.getBillingNergativeCases().getClickCanceli());
     	
 /////Patient Statement 
     	
     	Thread.sleep(6000);
     	// click  patient statement
     	Clickonelement(pom.getBillingNergativeCases().getClicPatientStatement());
     	
//     	sendkeys(pom.getBillingNergativeCases().getEnterPatientNmae(), "Daniel ");
//     	
//     // select   patient name
//     	Clickonelement(pom.getBillingNergativeCases().getSelectPatientNmae());
//     	
//     	// click  patient statement
//     	Clickonelement(pom.getBillingNergativeCases().getClickDownload());
     	
     	// click All patients
//     	Clickonelement(pom.getBillingNergativeCases().getClickallpatient());
//     	
//     	// click download
//     	Clickonelement(pom.getBillingNergativeCases().getClickDownload1());
     	
 ////    	Patient balance /ledger    	
     	Thread.sleep(6000);
     	
     	// click Patient balance /ledger  
     	Clickonelement(pom.getBillingNergativeCases().getClickPatientBalanceLedger());
     	
     	//enter Amount
     	sendkeys(pom.getBillingNergativeCases().getEnterName1(), "daniel");
     
     	// click Patient name
     	Clickonelement(pom.getBillingNergativeCases().getselectName());
     	
     	// click 0-30 Days
     	Clickonelement(pom.getBillingNergativeCases().getClick30days());
     	
     	// click 31-60 DaysDays
     	Clickonelement(pom.getBillingNergativeCases().getClick60days());
     	
     	// click 61-90 Days Days
     	Clickonelement(pom.getBillingNergativeCases().getClick90days());
     	
     	// click 91-120 Days Days
     	Clickonelement(pom.getBillingNergativeCases().getClick120days());
     	
     	// click 121 Days Days
     	Clickonelement(pom.getBillingNergativeCases().getClick121days());
     	
     	Thread.sleep(6000);
  // click Fees schedule
     	
     	Clickonelement(pom.getBillingNergativeCases().getclickFeesSchedule());
     	
     	Thread.sleep(2000);
     	
     	// click ICD9 
     	Clickonelement(pom.getBillingNergativeCases().getclickICd9());
     	
     	// click  EDIT
     	Clickonelement(pom.getBillingNergativeCases().getclickICD9Edit());
     	
     	// click  cancel
     	Clickonelement(pom.getBillingNergativeCases().getclickcancel());
     	
     	Thread.sleep(4000);
     	
     // click ICD10 
     	Clickonelement(pom.getBillingNergativeCases().getclickICd10());
     	
     	Thread.sleep(4000);
     	
     	// click  EDIT
//     	Clickonelement(pom.getBillingNergativeCases().getclickICD10Edit());
//     	
//     	// click  cancel
//     	Clickonelement(pom.getBillingNergativeCases().getclickcancel1());
//     	 
     	Thread.sleep(4000);
     	// Click EOB
     	Clickonelement(pom.getBillingNergativeCases().getClickEOB());	
     			
     	Thread.sleep(2000);
     	
     	// Click EOB
     	Clickonelement(pom.getBillingNergativeCases().getClickAddPayment());	
     	
    	//enter Amount
     	sendkeys(pom.getBillingNergativeCases().getEnterNumber(), "gunad");
     	
     	//enter Amount
     	sendkeys(pom.getBillingNergativeCases().getEnteramount(), "gunad");
     	     	
     	 // Click cancel
     	Clickonelement(pom.getBillingNergativeCases().getclickcancel2());  	
     	
     	System.out.println("Successful");
}
}