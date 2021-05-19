package cloud.components.MigAP;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingManualInvoicesITC extends BaseTest{


	public static String BusinessUnit;
	public static String Supplier;
	public static String InvoiceNum;
	public static String InvAmount;
	public static String Currency;
	public static String InvType;
	public static String Desc;
	public static String InvDate;
	public static String PaymentTerms;
	public static String TermsDate;
	public static String AccountingDate;
	public static String LiabilityDistribution;
	public static String LinesAmount;
	public static String DisbCombination;
	

	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id, 'UISmmLink::icon')]")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form

		clickElement(By.xpath("//a[@id='pt1:nv_itemNode_payables_payables_invoices']")); //Invoices
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Create Invoice")); //Create Invoice
		clickElement(By.xpath("//*[contains(@id,'MAnt2:1:pm1:r1:0:ap1:cl1')]"));//Show more
		
		//Enter fields
		setElementText(By.xpath("//*[contains(@id,'ic2::content')]"), BusinessUnit); //BusinessUnit
		setElementText(By.xpath("//*[contains(@id,'ic3::content')]"), Supplier); //Supplier
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:i2::content')]"), InvoiceNum); //InvoiceNum
		setElementText(By.xpath("//option[contains(text(),'USD - US Dollar')]"), Currency); //Currency
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:i3::content')]"), InvAmount); //InvAmount
		setElementText(By.xpath("//option[contains(text(),'Standard')]"), InvType); //InvType
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:i4::content')]"), Desc); //Description
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:id2::content')]"), InvDate); //Date
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:so3::content')]"), PaymentTerms); //PaymentTerms
		setElementText(By.xpath("//*[contains(@id,'ap1:r2:0:id5::content')]"), TermsDate); //TermsDate
		clickElement(By.linkText("Accounting"));//Click Accounting link
		setElementText(By.xpath("//*[contains(@id, 'ap1:id4::content')]"), AccountingDate); //AccountingDate
		setElementText(By.xpath("//*[contains(@id, 'ap1:kf2CS::content')]"), LiabilityDistribution); //LiabilityDistribution
		clickElement(By.xpath("//*[contains(@id, 'ap1:sh2::_afrDscl')]")); //ExpandLines
		setElementText(By.xpath("//*[contains(@id, 'ATp:ta2:0:i26::content')]"), LinesAmount); //LinesAmount
		setElementText(By.xpath("//*[contains(@id, 'ATp:ta2:0:kf1CS::content')]"), DisbCombination);
		clickElement(By.linkText("Additional Information")); //Click link
		clickElement(By.xpath("//a[contains(text(),'Invoice Actions')]"));
		clickElement(By.linkText("//td[contains(text(),'Validate')]"));
		clickElement(By.xpath("//a[contains(text(),'Invoice Actions')]"));
		clickElement(By.linkText("//td[contains(text(),'Post to Ledger')]"));
		clickElement(By.xpath("//*[contains(@id, 'ap1:cb43')]"));// Confirmation OK
		clickElement(By.xpath("//*[contains(@id, 'ap1:cb14')]")); //Save and close
			
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingManualInvoicesITC.class);
			run();
		}
	}

}
