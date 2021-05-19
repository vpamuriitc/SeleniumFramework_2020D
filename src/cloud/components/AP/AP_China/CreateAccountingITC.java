package cloud.components.MigAP;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreateAccountingITC extends BaseTest{


	public static String Ledger;
	
	

	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id, 'UISmmLink::icon')]")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form

		clickElement(By.xpath("//a[@id='pt1:nv_itemNode_payables_payables_invoices']")); //Invoices
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Create Accounting")); //Create Accounting link
		clickElement(By.xpath("//*[contains(@id,'SubledgerApplicationAttr::content')]"));
		clickElement(By.xpath("//option[contains(text(),'Payables')]")); //Payables
		setElementText(By.xpath("//*[contains(@id,'LedgerAttr::content')]"), Ledger); //ITC USA PL
		clickElement(By.xpath("//*[contains(@id,'requestBtns:submitButton')]"));
		clickElement(By.xpath("//*[contains(@id,'confirmSubmitDialog::ok')]"));
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
