package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PromotingWorkersITC extends BaseTest{
	
	public static String JobID;
	public static String Grade;
	public static String SalaryAmount;
	
	private static void run() throws InterruptedException{
		
		
		
		
//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		
//		clickElement(By.id("pt1:nv_itemNode_manager_resources_manager_resources_dashboard"));
		 
		clickElement(By.xpath("//div[@id='pt1:r1:0:AP2:oc_7737547698region1:0:ctb1']/a/span"));
		
		Thread.sleep(3000);
		
		clickElement(By.id("pt1:r1:0:AP2:oc_7737547698region1:0:r1:1:hgsdi3::disAcr"));
		
		Thread.sleep(2000);
		
		clickElement(By.xpath("//div[@id='pt1:r1:0:AP2:oc_7737547698region1:0:r1:1:r5:0:hgATT2:_ATTp:hgtt2::db']/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td[2]"));
		  
//		clickElement(By.id("pt1:r1:0:AP2:oc_7737547698region1:0:r1:1:hgATT1:_ATTp:hgtt1::db']/table[1]/tbody/tr[2]/td[1]"));
		
		Thread.sleep(3000);
		
		clickElement(By.linkText("Actions"));
		 
		
		clickElement(By.xpath("//tr[@id='pt1:r1:0:AP2:oc_7737547698region1:0:r1:1:r5:0:hgATT2:_ATTp:am2:dc_i1:3:dcm1']/td[2]"));
		
		clickElement(By.xpath("//tr[@id='pt1:r1:0:AP2:oc_7737547698region1:0:r1:1:r5:0:hgATT2:_ATTp:am2:dc_i1:3:dci1:11:dccmi1']/td[2]"));
		
		Thread.sleep(2000);
		 
		 new Select(browser.findElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:0:pt1:ap1:selectOneChoice2::content"))).selectByVisibleText("Performance");
		
		 clickElement(By.cssSelector("option[title=\"Performance\"]"));
		 
		 setElementText(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:0:pt1:ap1:JobDe1:0:job1Id::content"), JobID);
		 
		 clickElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:0:pt1:ap1:JobDe1:0:asgGradeLadderId::content"));
		 
		 Thread.sleep(1000);
		  
		 setElementText(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:0:pt1:ap1:JobDe1:0:grade1Id::content"), Grade);
		 
		 
		 setElementText(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:0:pt1:ap1:JobDe1:0:inputText6::content"), "45");
		 
		 clickElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:0:pt1:ap1:JobDe1:0:df3_BaseWorkerAsgDFFIterator__FLEX_ContextItaly::content"));
		
		 clickElement(By.cssSelector("option[title=\"Practice_GDC\"]"));
		  
		 clickElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:0:pt1:ap1:tt1:tbb1:1:_afrButtonStopNavItem"));
		  
		 setElementText(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:1:pt2:ap1:r1:0:idPropSalaryAmount::content"), SalaryAmount);

		 clickElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:1:pt2:ap1:tt1:tbb1:1:_afrButtonStopNavItem"));
		
		 clickElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:2:pt4:ap1:tt1:tbb1:1:_afrButtonStopNavItem"));
		 
		 clickElement(By.cssSelector("span.x1gs"));
		  
		 clickElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:3:pt5:ap1:tt1:okWarningDialog"));
		  
		 clickElement(By.id("pt1:USma:0:MAt4:0:pt1:Promo1:3:pt5:ap1:tt1:okConfirmationDialog"));
		 
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PromotingWorkersITC.class);
			run();
		}
	}

}
