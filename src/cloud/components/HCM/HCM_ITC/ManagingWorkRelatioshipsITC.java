package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ManagingWorkRelatioshipsITC extends BaseTest{
	
	public static String PersonName;
	public static String SeniorityDate;
	
	
	private static void run(){
		
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), PersonName);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));

		//		clickElement(By.cssSelector("td.p_AFFocused.xu5"));

		clickElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk,'0')]"));


		clickElement(By.linkText("Actions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dcm1"));

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:12:dccmi1']/td[2]"));
	
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:AP1:edit::popEl")); 

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:AP1:edtBtn']/td[2]"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:r1:0:pt1:r1:0:AP1:r2:0:id3::content"), SeniorityDate);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:r1:0:pt1:r1:0:AP1:tt1:submit']/a/span"));
		    
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:1:r1:0:pt1:r1:0:AP1:tt1:okWarningDialog"));		    
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingWorkRelatioshipsITC.class);
			run();
		}
	}

}
