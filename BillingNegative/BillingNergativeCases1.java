package com.BillingNegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingNergativeCases1 {

	public WebDriver driver;

	@FindBy(id = "normal_login_username")

	private WebElement username;

	public BillingNergativeCases1(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}
	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	@FindBy(xpath = "//a[normalize-space()='Billing']")
    private WebElement ClickBillingModule;

    public WebElement getClickBillingModule() {
	return ClickBillingModule;
   }
 ////Patient Payment   
    
    @FindBy(xpath = "//a[contains(text(),'Patient Payments')]")
    private WebElement ClickPatientPayment;

    public WebElement getClickPatientPayment() {
	return ClickPatientPayment;
   }  
    @FindBy(xpath = "//tbody/tr[1]/td[7]/button[1]")
    private WebElement ClickPay;

    public WebElement getClickPay() {
	return ClickPay;
   }  
    @FindBy(xpath = "//input[@id='amountval']")
    private WebElement EnterAmount;

    public WebElement getEnterAmount() {
	return EnterAmount;
   }   
    @FindBy(xpath = "//button[normalize-space()='Add Payment']")
    private WebElement ClickaddPayment;

    public WebElement getClickaddPayment() {
	return ClickaddPayment;
   } 
    
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    private WebElement Clickcancel;

    public WebElement getClickcancel() {
	return Clickcancel;
   } 
    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-2']")
    private WebElement ClickPatientPayment1;

    public WebElement getClickPatientPayment1() {
	return ClickPatientPayment1;
   } 
    @FindBy(xpath = "//input[@id='search-btn-hover']")
    private WebElement EnterName;

    public WebElement getEnterName() {
	return EnterName;
   } 
    @FindBy(xpath = "//div[@class='title']")
    private WebElement selectname;

    public WebElement getselectname() {
	return selectname;
  }
    @FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body bth MuiTableCell-alignLeft']//button[@type='button'][normalize-space()='Pay']")
    private WebElement Clickpay;

    public WebElement getClickpay() {
	return Clickpay;
   } 
    @FindBy(xpath = " //button[normalize-space()='Cancel']")
    private WebElement ClickCanceli;

    public WebElement getClickCanceli() {
	return ClickCanceli;
   } 
    
  /////Patient Statement  
    
    @FindBy(xpath = "//a[normalize-space()='Patient Statements']")
    private WebElement ClicPatientStatement;

    public WebElement getClicPatientStatement() {
	return ClicPatientStatement;
   } 
    @FindBy(xpath = "//input[@id='billing_pat_stmt_pat_srch-b']")
    private WebElement EnterPatientNmae;

    public WebElement getEnterPatientNmae() {
	return EnterPatientNmae;
   }
    @FindBy(xpath = "(//div[contains(text(),'danielk')])[1]")
    private WebElement SelectPatientNmae;

    public WebElement getSelectPatientNmae() {
	return SelectPatientNmae;
   }
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/button[1]")
    private WebElement ClickDownload;

    public WebElement getClickDownload() {
	return ClickDownload;
   } 
    @FindBy(xpath = "//div[@id='rc-tabs-1-tab-2']")
    private WebElement Clickallpatient;

    public WebElement getClickallpatient() {
	return Clickallpatient;
   }
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/button[1]")
    private WebElement ClickDownload1;

    public WebElement getClickDownload1() {
	return ClickDownload1;
   }
    @FindBy(xpath = "//a[normalize-space()='Patient Ledger']")
    private WebElement ClickPatientBalanceLedger;

    public WebElement getClickPatientBalanceLedger() {
	return ClickPatientBalanceLedger;
   } 
    @FindBy(xpath = "//input[@placeholder='Search Patient']")
    private WebElement EnterName1;

    public WebElement getEnterName1() {
	return EnterName1;
   } 
    @FindBy(xpath = "(//div[contains(text(),'danielk')])[1]")
    private WebElement selectName;

    public WebElement getselectName() {
	return selectName;
   }  
    @FindBy(xpath = "//tbody/tr[@class='MuiTableRow-root table-data-row schedule-body-row']/td[1]")
    private WebElement Click30days;

    public WebElement getClick30days() {
	return Click30days;
   }  
    @FindBy(xpath = "//tbody/tr[@class='MuiTableRow-root table-data-row schedule-body-row']/td[1]")
    private WebElement Click60days;

    public WebElement getClick60days() {
	return Click60days;
   }  
    @FindBy(xpath = "//tbody/tr[@class='MuiTableRow-root table-data-row schedule-body-row']/td[1]")
    private WebElement Click90days;

    public WebElement getClick90days() {
	return Click90days;
   }  
    @FindBy(xpath = "//tbody/tr[@class='MuiTableRow-root table-data-row schedule-body-row']/td[1]")
    private WebElement Click120days;

    public WebElement getClick120days() {
	return Click120days;
   } 
    @FindBy(xpath = "//tbody/tr[@class='MuiTableRow-root table-data-row schedule-body-row']/td[1]")
    private WebElement Click121days;

    public WebElement getClick121days() {
	return Click121days;
   } 
/////////////////////  FEES SCHEDULE   ////////////////////////////
    


    @FindBy(xpath = "//a[@id='billing-fee-schedule_left-nav_title']")
    private WebElement clickFeesSchedule;

    public WebElement getclickFeesSchedule() {
    	return clickFeesSchedule;
    } 
    
////ICD9
    @FindBy(xpath = "//div[@id='rc-tabs-2-tab-2']")
    private WebElement clickICd9;

    public WebElement getclickICd9() {
	return clickICd9;
   } 
    @FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
    private WebElement clickICD9Edit;

    public WebElement getclickICD9Edit() {
	return clickICD9Edit;
   } 
    @FindBy(xpath = "//button[@id='billing-icd9-10-ad-new-pup-cancel']")
    private WebElement clickcancel;

    public WebElement getclickcancel() {
	return clickcancel;
   }
////ICD10
    @FindBy(xpath = "//div[@id='rc-tabs-2-tab-3']")
    private WebElement clickICd10;

    public WebElement getclickICd10() {
	return clickICd10;
   } 
    @FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]/*[1]")
    private WebElement clickICD10Edit;

    public WebElement getclickICD10Edit() {
	return clickICD10Edit;
   } 
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement clickcancel1;

    public WebElement getclickcancel1() {
	return clickcancel1;
   }   
    

    ///////////////////////   EOB  Add Payment        ///////////////////
    
     
    @FindBy(xpath = "//a[normalize-space()='EOB']")
    private WebElement ClickEOB;

    public WebElement getClickEOB() {
	return ClickEOB;
   }     
    @FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root eob-ad-ic'])[1]")
    private WebElement ClickAddPayment;

    public WebElement getClickAddPayment() {
	return ClickAddPayment;
   } 
    @FindBy(xpath = " //div[@class='col-md-2 text-left eob-mrg-r-105']//input[@type='text']")
    private WebElement EnterNumber;

    public WebElement getEnterNumber() {
	return EnterNumber;
   }
    @FindBy(xpath = "//div[@class='col-md-2 text-left']//input[@type='text']")
    private WebElement Enteramount;

    public WebElement getEnteramount() {
	return Enteramount;
   } 
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement clickcancel2;

    public WebElement getclickcancel2() {
	return clickcancel2;
   }
    
    
    
}
