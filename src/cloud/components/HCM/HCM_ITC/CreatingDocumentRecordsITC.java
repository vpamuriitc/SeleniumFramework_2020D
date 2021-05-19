package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingDocumentRecordsITC extends BaseTest{

	public static String PersonName;
	public static String DocumentCode;
	public static String DocumentName;
	public static String DocumentNumber;
	public static String ToDate;
	public static String FromDate;
	public static String IssuedON;
	public static String IssuingAuthority;
	public static String Comments;

	private static void run() throws InterruptedException{


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), PersonName);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));

		clickElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk,'0')]"));


		clickElement(By.linkText("Actions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dcm1"));

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:5:dccmi1']/td[2]"));


		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:AP1:pc1:ctb1']/a/span"));
		
		Thread.sleep(3000);

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:documentType::content"))).selectByVisibleText("Medical Reports");

		clickElement(By.cssSelector("option[title=\"Medical Reports\"]"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputText7::content"), DocumentCode);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputText6::content"), DocumentName);


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputText5::content"), DocumentNumber);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputDate3::content"), FromDate);


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputDate2::content"), ToDate);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputDate1::content"), IssuedON);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputText2::content"), IssuingAuthority);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:Docum1:0:inputText1::content"), Comments);

		clickElement(By.cssSelector("span.x1gs"));		    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:AP1:tt1:okConfirmationDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:_FOTsr2:0:cb1"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDocumentRecordsITC.class);
			run();
		}
	}

}
