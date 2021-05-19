package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class HiringEmployeesITC extends BaseTest{

	public static String Legal_Employer;
	public static String LastName;
	public static String FirstName;
	public static String CandidateID;
	public static String SSID;
	public static String Address;
	public static String Pincode;
	public static String AreaCode;
	public static String PhoneNumber;
	public static String WorkEmail;
	public static String BusinessUnit;
	public static String Salary;
	public static String ReviewDate;
	

	private static void run() throws InterruptedException{


//		clickElement(By.id("pt1:_UISmmLink::icon"));
//
//		clickElement(By.id("pt1:nv_itemNode_workforce_management_new_person"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:_FOTsdiAddCwkDefaultRegional::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:_FOTRaT:0:RAtl1"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:selectOneChoice3::content"), Legal_Employer);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:selectOneChoice2::content"));
		
				
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r1:0:r1:0:i1:4:it20::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r1:0:r1:0:i1:4:it20::content"), LastName);		    

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r1:0:r1:0:i1:5:it60::content"), FirstName);		    

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorcandidate__FLEX_EMPTY::content"), CandidateID);
	
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r2:0:AT2:_ATp:create::icon"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r2:0:AT2:_ATp:table2:0:it1::content"), SSID);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:tt1:next']/a/span/span"));		    

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:Perso1:0:Maint1:0:i1:0:inputText17::content"), Address);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:Perso1:0:Maint1:0:i1:5:inputComboboxListOfValues28::content"), Pincode);

		Thread.sleep(4000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r1:0:AT1:_ATp:create::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r1:0:AT1:_ATp:table1:0:soc1::content"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r1:0:AT1:_ATp:table1:0:soc1::content"))).selectByVisibleText("Home Phone");

		clickElement(By.cssSelector("option[title=\"Home Phone\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r1:0:AT1:_ATp:table1:0:it2::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r1:0:AT1:_ATp:table1:0:it2::content"), AreaCode);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r1:0:AT1:_ATp:table1:0:it3::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r1:0:AT1:_ATp:table1:0:it3::content"), PhoneNumber);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r2:0:AT1:_ATp:create::icon"));		    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r2:0:AT1:_ATp:table1:0:soc1::content"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r2:0:AT1:_ATp:table1:0:soc1::content"))).selectByVisibleText("Work E-Mail");

		clickElement(By.cssSelector("option[title=\"Work E-Mail\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r2:0:AT1:_ATp:table1:0:it1::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r2:0:AT1:_ATp:table1:0:it1::content"), WorkEmail);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratorVeteranSelfIdentification_DisplayUS::lovIconId"));
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratorVeteranSelfIdentification_DisplayUS::dropdownPopup::dropDownContent::db']/table/tbody/tr[3]/td"));


//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratorVeteranSelfIdentification_DisplayUS::content'"));
//		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIteratorVeteranSelfIdentification_DisplayUS::content'"), "Declines to Self-Identify");
		Thread.sleep(4000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:Perso2:0:pt_r3:0:df1_PersonLegislativeIterator__FLEX_ContextUS::content"));
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:1:AP1:tt1:next']/a/span"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:NewPe3:0:NewPe1:0:businessUnitId::content"), BusinessUnit);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:NewPe3:0:r5:0:idSalaryBasis::content"), "03 USA1 Annual Salary");
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:NewPe3:0:r5:0:idSalaryBasis::content"));
		Thread.sleep(7000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:NewPe3:0:r5:0:idSalaryAmount::content"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:NewPe3:0:r5:0:idSalaryAmount::content"), Salary);		    

		Thread.sleep(4000);
		
//		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:NewPe3:0:r5:0:id2::content"), ReviewDate);		    

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:NewPe3:0:JobDe1:0:df2_BaseWorkerAsgDFFIterator__FLEX_Context__FLEX_EMPTY::content"))).selectByVisibleText("Practice_GDC");

		clickElement(By.cssSelector("option[title=\"Practice_GDC\"]"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:2:AP2:tt1:next']/a"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:3:AP1:tt1:next']/a"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:AP1:tt1:submit']/a"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:AP1:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:4:AP1:tt1:okConfirmationDialog"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(HiringEmployeesITC.class);
			run();
		}
	}

}
