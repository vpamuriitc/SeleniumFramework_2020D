package cloud.components.ARUSA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingReceiptsandApplyITC extends BaseTest{

	public static String BusinessUnit;
	public static String ReceiptMethod;
	public static String ReceiptNumber;
	public static String EnteredAmount;
	public static String ReceiptDate;
	public static String AccountingDate;
	public static String CustomerAccountNum;
	public static String TransactionCustomerAccNum;
	
	
	private static void run() throws InterruptedException{
		Thread.sleep(5000);
		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		Thread.sleep(5000);
		//clickElement(By.xpath("//a[@id='_FOpt1:nv_itemNode_receivables_receivables_balances']"));
		clickElement(By.xpath("//*[contains(@id, 'pt1:nv_itemNode_receivables_receivables_balances')]")); //Account Receivables
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks Button
		Thread.sleep(5000);
		clickElement(By.linkText("Create Receipt"));
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'is1::content')]"), BusinessUnit); //Business Unit : IT Convergence USA BU
		browser.findElement(By.xpath("//*[contains(@id, 'is1::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		setElementText(By.xpath("//*[contains(@id, 'receiptMethodId::content')]"), ReceiptMethod); //ReceiptMethod : ITC_US_MANUAL
		browser.findElement(By.xpath("//*[contains(@id, 'receiptMethodId::content')]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		setElementText(By.xpath("//*[contains(@id,'receiptNumberId::content')]"),ReceiptNumber); //ReceiptNumber : 445533
		Thread.sleep(5000);
		//selecting row
		clickElement(By.xpath("//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:1:pt1:RCF1:0:ap1:receiptMethodId_afrLovInternalTableId::db']/table/tbody/tr[1]/td[1]"));
		clickElement(By.xpath("//*[contains(@id, 'MAnt2:1:pt1:RCF1:0:ap1:receiptMethodId::lovDialogId::ok')]"));
		clickElement(By.xpath("//*[contains(@id, 'currencyCode4Id::content')]")); //Currency
		Thread.sleep(5000);
		clickElement(By.id("//option[contains(text(),'USD - US Dollar')]"));
		setElementText(By.xpath("//*[contains(@id, 'amountId::content')]"), EnteredAmount); //EnteredAmount: 100
		setElementText(By.id("//*[contains(@id, 'receiptDateID::content')]"), ReceiptDate); //ReceiptDate
		setElementText(By.id("//*[contains(@id, 'glDateId::content')]"), AccountingDate); //AccountingDate
		setElementText(By.xpath("//*[contains(@id, 'customerAccountId::content')]"), CustomerAccountNum); //CustomerAccountNumber: 123641
		clickElement(By.id("//*[contains(@id, 'commandButton2::popEl')]")); //
		clickElement(By.id("//td[contains(text(),'Submit and Apply Manually')]"));
		
		clickElement(By.xpath("//*[contains(@id, 'commandButton2')]")); //AddOpenReceivables
		setElementText(By.xpath("//*[contains(@id, 'value60::content')]"), TransactionCustomerAccNum); //TransactionCustomerAccNum : 123641
		clickElement(By.xpath("//*[contains(@id, 'q1::search')]")); //Search
		clickElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FOSritemNode_receivables_receivables_balances:0:MAnt2:2:pt1:REF:0:ap1:AT1:_ATp:cb2']")); //Add
		clickElement(By.xpath("//*[contains(@id, '0:MAnt2:2:pt1:REF:0:ap1:AT1:_ATp:cb3')]")); //Done
		clickElement(By.xpath("//*[contains(@id, 'commandButton122')]")); //Saveandclose
		
		
		
		
		
		
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreatingReceiptsandApplyITC.class);
		run();
	}
}

}
