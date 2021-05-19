package cloud.components.MigAP;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class OpenClosePeriodsITC extends BaseTest{


	public static String Ledger;
	
	
	

	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id, 'UISmmLink::icon')]")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form

		clickElement(By.xpath("//a[@id='pt1:nv_itemNode_payables_payables_invoices']")); //Invoices
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Manage Accounting Periods")); //Manage Accounting Periods
		clickElement(By.xpath("//*[contains(@id,'SelectOneAppSelected::content')]"));
		clickElement(By.xpath("//option[contains(text(),'Payables')]")); //Payables
		clickElement(By.xpath("//*[contains(@id,'ATp:table1:8:ot9')]")); //Ledger ITC_USA_PL
		clickElement(By.xpath("//*[contains(text(),'JUL-19')]"));
		clickElement(By.xpath("//*[contains(@id,'AT1:_ATp:ctb3')]")); //Close Period
		//clickElement(By.xpath("//*[contains(@id,'ATp:selectStatus::content')]")); //Status
		clickElement(By.xpath("//*[contains(text(),'JUL-19')]"));
		clickElement(By.xpath("//*[contains(@id,'ATp:ctb1')]")); //OpenPeriod
	
		
		
		
		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(OpenClosePeriodsITC.class);
			run();
		}
	}

}
