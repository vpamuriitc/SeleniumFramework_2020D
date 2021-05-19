package cloud.components.ARUSA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import itc.framework.BaseTest;

public class ClosingARITC extends BaseTest{

	public static String Ledger;
	
	private static void run() throws InterruptedException{
		Thread.sleep(5000);
		clickElement(By.id("pt1:_UISmmLink::icon")); //Navigator
		Thread.sleep(5000);
		clickElement(By.xpath("//*[contains(@id, 'nv_itemNode_receivables_receivables_balances')]")); //AccountReceivables
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Tasks
		clickElement(By.linkText("Manage Accounting Periods"));
		clickElement(By.xpath("//*[contains(@id, 'SelectOneAppSelected::content')]")); //Application
		clickElement(By.xpath("//option[contains(text(),'Receivables')]")); //
	//	setElementText(By.xpath(""), Ledger); 
		clickElement(By.xpath("//*[contains(@id, '_ATp:table1:8:ot9')]")); // ITC USA PL
		clickElement(By.xpath("//*[contains(text(), 'SEP-17')]")); // SEP-17
		clickElement(By.xpath("//*[contains(@id, '_ATp:ctb3')]")); //Close period
		
		
		//Open Period
		
		clickElement(By.xpath("//*[contains(@id, 'selectStatus::content')]")); //Status
		clickElement(By.xpath("//option[contains(text(),'Closed')]")); //Closed
		clickElement(By.xpath("//*[contains(text(), 'SEP-17')]"));
		clickElement(By.xpath("//*[contains(@id, '_ATp:ctb1')]")); //Open Period
		
		
		
		
	}


public static void run(int iterations) throws Exception{
	initComponent();
	for(int i=0;i<iterations;i++)
	{
		iteration=i;
		popluateParams(ClosingARITC.class);
		run();
	}
}

}
