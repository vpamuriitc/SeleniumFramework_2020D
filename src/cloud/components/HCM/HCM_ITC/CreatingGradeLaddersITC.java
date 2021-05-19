package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingGradeLaddersITC extends BaseTest{

	public static String Date;
	public static String GradeladderName;
	public static String GradeValue;
	public static String GradeValue1;
	public static String GradeValue2;
	public static String GradeRate;


	private static void run() throws InterruptedException{


		//clickElement(By.id("pt1:_UISmmLink::icon"));

		//clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));

		Thread.sleep(8000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl7"));

		Thread.sleep(2000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP5:pc1:_ATp:commandToolbarButton1']/a/span"));


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:esd::content"),Date);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:setNameId::lovIconId"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:setNameId::dropdownPopup::dropDownContent::db']/table/tbody/tr[7]/td"));

		Thread.sleep(2000);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:GradeLadderName::content"),GradeladderName);

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:selectOneChoice2::content"))).selectByVisibleText("Grade");

		clickElement(By.cssSelector("option[title=\"Grade\"]"));

		Thread.sleep(2000);

		//clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:actionReasonId::lovIconId"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:tt1:next']/a/span/span"));

		Thread.sleep(2000);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:q1:value00::content"),GradeValue);


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:q1::search"));

		Thread.sleep(3000);

		clickElement(By.cssSelector("td.xzn"));

		Thread.sleep(2000);		

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:pc1:_ATp:addToGradeLadder']/a/span"));

		Thread.sleep(3000);


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:q1:value00::content"),GradeValue1);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:q1::search"));

		Thread.sleep(3000);

		clickElement(By.cssSelector("td.xzn"));

		Thread.sleep(2000);		

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:pc1:_ATp:addToGradeLadder']/a/span"));

		Thread.sleep(3000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:selectOneRadio1:_1"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:dialog1::ok"));
		
		Thread.sleep(5000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:pc1:_ATp:t1::db']/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td"));

		Thread.sleep(5000);

//		clickElement(By.cssSelector("tr.p_AFSelected.xe8 > td.xz4"));
//
//		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:tt1:next']/a/span/span"));
//
//		clickElement(By.cssSelector("span.x1kp"));


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:q1:value00::content"),GradeValue2);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:q1::search"));

		Thread.sleep(3000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:Grade1:0:pc1:_ATp:addToGradeLadder']/a/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:tt1:next']/a/span"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:Grade1:0:soc1::content"))).selectByVisibleText("AE Legislative Data Group");

		clickElement(By.cssSelector("option[title=\"AE Legislative Data Group\"]"));

		Thread.sleep(2000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:Grade1:0:gradeRateNameId::lovIconId"));

		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:Grade1:0:gradeRateNameId::dropdownPopup::popupsearch"));
		
		Thread.sleep(2000);
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:Grade1:0:gradeRateNameId::_afrLovInternalQueryId:value00::content"),GradeRate);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:Grade1:0:gradeRateNameId::_afrLovInternalQueryId::search"));
	    
	    Thread.sleep(3000);
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:Grade1:0:gradeRateNameId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td"));
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:Grade1:0:gradeRateNameId::lovDialogId::ok"));
		
		Thread.sleep(2000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:AP3:tt1:next']/a"));

		Thread.sleep(2000);
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:AP4:r2:0:r1:0:th1:dc_m1']/div/table/tbody/tr/td[3]/div"));

		Thread.sleep(2000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:AP4:tt1:submit']/a"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:AP4:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:AP4:tt1:okConfirmationDialog"));

		
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingGradeLaddersITC.class);
			run();
		}
	}

}
