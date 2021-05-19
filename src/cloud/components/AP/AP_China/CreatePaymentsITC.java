package cloud.components.MigAP;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatePaymentsITC extends BaseTest{


	public static String BusinessUnit;
	public static String Supplier;
	public static String SupplierSite;
	public static String PaymentDate;
	public static String Desc;
	public static String BankAccount;
	public static String PaymentMethod;
	public static String PaymentProcessProfile;
	public static String PaymentDocument;
	public static String PPRName;
	public static String PayThroughDate;
	

	private static void run() throws Exception  {

		clickElement(By.xpath("//*[contains(@id, 'UISmmLink::icon')]")); //Navigator
		//clickElement(By.id("pt1:_UISnvr:0:nvcl1"));//Form

		clickElement(By.xpath("//a[@id='pt1:nv_itemNode_payables_payables_payments']")); //Payments
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Create Payment")); //Create Payment

		//Enter fields
		setElementText(By.xpath("//*[contains(@id,'AP1:OrgUiId::content')]"), BusinessUnit); //BusinessUnit
		setElementText(By.xpath("//*[contains(@id,'AP1:payeeNameId::content')]"), Supplier); //Supplier
		setElementText(By.xpath("//*[contains(@id,'AP1:vendorSiteIdUiCompId::content')]"), SupplierSite); //SupplierSite
		setElementText(By.xpath("//*[contains(@id,'AP1:checkDate::content')]"), PaymentDate); //PaymentDate
		clickElement(By.xpath("//*[contains(@id,'AP1:paymentTypeFlagUi::content')]"));//Type
		clickElement(By.xpath("//option[contains(text(),'Quick')]"));//Select Payment Type
		setElementText(By.xpath("//*[contains(@id,'AP1:inputText4::content')]"), Desc); //Description
		setElementText(By.xpath("//*[contains(@id,'AP1:bankAccountNameId::content')]"), BankAccount); //BankAccount
		clickElement(By.xpath("//*[contains(@id,'AP1:currencyCode2Id::content')]")); //PaymentCurrency
		clickElement(By.xpath("//option[contains(text(),'USD - US Dollar')]"));//USD - Dollar
		setElementText(By.xpath("//*[contains(@id,'AP1:paymentMethodNameUiId::content')]"), PaymentMethod); //PaymentMethod
		
		setElementText(By.xpath("//*[contains(@id,'AP1:paymentProfileUICompId::content')]"), PaymentProcessProfile); //PaymentTerms
		setElementText(By.xpath("//*[contains(@id,'AP1:PaymentDocumentIdUi::content')]"), PaymentDocument); //PaymentDocument
		clickElement(By.xpath("//*[contains(@id,'ATp:commandToolbarButton1::icon')]"));//Select and add button
		//(By.xpath("//*[contains(@id,'ATp_afr_t1_afr_column4::content')]"), InvoiceNumber);//Enter Invoice Number to Pay
		clickElement(By.xpath("//*[contains(text(),'RG1')]"));
		clickElement(By.xpath("//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:cb1']"));//Apply Button
		clickElement(By.xpath("//*[contains(text(),'IBM1000')]"));
		clickElement(By.xpath("//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:cb1']"));//Apply Button
		clickElement(By.xpath("//*[contains(text(),'T3INV1234')]"));
		clickElement(By.xpath("//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:cb1']"));//Apply Button
		clickElement(By.xpath("//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:dialog1::ok']")); //OK
		clickElement(By.xpath("//button[@id='pt1:_FOr1:1:_FOSritemNode_payables_payables_payments:0:MAnt2:2:AP1:cb5']")); //Save and Close
		clickElement(By.xpath("//button[@id='d1::msgDlg::cancel']"));//Confirmation msg
		clickElement(By.xpath("//*[contains(@id, 'FndTasksList::icon')]")); //Task button
		clickElement(By.linkText("Submit Payment Process Request")); //Submit Payment Process Request
		setElementText(By.xpath("//*[contains(@id,'ap1:inputText1::content')]"),PPRName);
		setElementText(By.xpath("//*[contains(@id,'ap1:inputDate2::content')]"),PayThroughDate);
		clickElement(By.xpath("//*[contains(@id,'ap1:SPsb2')]"));//Submit
			
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatePaymentsITC.class);
			run();
		}
	}

}
