package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class ManageEnterpriseHCMInformationITC extends BaseTest{

	public static String ApplSearch;
	public static String StartTime;
	public static String EndTime;
	public static String EmploymentModel;

	private static void run() throws InterruptedException{

//        clickElement(By.id("pt1:_UISmmLink::icon"));
//		
//		clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
		
//		clickElement(By.cssSelector("option[title=\"All\"]"));

		setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s1:it1::content"), ApplSearch);

		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s1:ctb1::icon"));

		clickElement(By.id("pt1:r1:0:r0:1:AP1:t1:0:cl2"));
		
		//increase the wait time here if the application timesout or takes a lot of time to load the next page
		Thread.sleep(40000);

		clickElement(By.cssSelector("span.xpc"));
		
						
		clickElement(By.xpath("//tr[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:tt1:commandMenuItem2']/td[2]"));
		
		Thread.sleep(3000);
		
		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:r1:0:r1:0:dynam1:0:CTXRN1:0:_WORK_START_TIME::content"));

		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:r1:0:r1:0:dynam1:0:CTXRN1:0:_WORK_START_TIME::content"), StartTime);

		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:r1:0:r1:0:dynam1:0:CTXRN1:0:_WORK_END_TIME::content"));
		
		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:r1:0:r1:0:dynam1:0:CTXRN1:0:_WORK_END_TIME::content"),EndTime);

		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:r1:0:r1:0:dynam1:0:CTXRN2:0:_EMPLOYMENT_MODEL_Display::content"), EmploymentModel);

		clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:tt1:submit']/a/span"));

		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:tt1:okWarningDialog"));
		
		Thread.sleep(10000);

		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ap1:tt1:okConfirmationDialog"));

//		clickElement(By.cssSelector("span.x1gs"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManageEnterpriseHCMInformationITC.class);
			run();
		}
	}

}
