package cloud.components.ARUSA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class CreateAccountingITC extends BaseTest{

	public static String Ledger;
	
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_payables_payables_invoices')]")); //Invoices
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Create Accounting"));
		clickElement(By.xpath("//*[contains(@id, 'SubledgerApplicationAttr::content')]")); //Subledger application
		clickElement(By.xpath("//option[contains(text(),'Receivables')]")); //Receivables
		setElementText(By.xpath("//*[contains(@id, 'LedgerAttr::content')]"), Ledger); //Ledger : ITC USA PL
		clickElement(By.xpath("//*[contains(@id, '0:MAnt2:1:ap1:r1:requestBtns:submitButton')]")); //Submit
		clickElement(By.xpath("//*[contains(@id, 'MAnt2:1:ap1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok')]")); //Conformation : OK
		//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_payables_payables_invoices:0:MAnt2:1:ap1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok"]
	
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(CreateAccountingITC.class);
		run();
	}
}

}
