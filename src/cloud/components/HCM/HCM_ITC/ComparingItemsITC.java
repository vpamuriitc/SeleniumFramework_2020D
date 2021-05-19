package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ComparingItemsITC extends BaseTest{
	
	public static String EmployeeName;
	public static String KeyWord;
	public static String JOBName;
	private static void run() throws InterruptedException{
		
			//clickElement(By.id("pt1:_UISmmLink::icon"));

			//clickElement(By.id("pt1:nv_itemNode_workforce_management_person_management"));
		
			Thread.sleep(5000);
				
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"),EmployeeName) ;
	    		    
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value30::content"),KeyWord);
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));
		    
		    Thread.sleep(5000);
		    
		   		    
		    clickElement(By.cssSelector("td.xz4"));
		    
		    Thread.sleep(5000);
		    
		    clickElement(By.linkText("Actions"));
		    
		    //clickElement(By.cssSelector("div.xin"));
		    		    		    
		    Thread.sleep(5000);
		    
		    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dcm1']/td[2]"));
			    
		    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:0:dccmi1']/td[2]"));
		    
		    Thread.sleep(4000);
		    
		    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:comparisonPanel1:comparisonCategoryId::content"))).selectByVisibleText("Job");
		    
		    Thread.sleep(5000);
		    
		    clickElement(By.cssSelector("option[title=\"Job\"]"));
		    
		    Thread.sleep(5000);
		    
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:comparisonPanel1:jobId_Name::content"),JOBName);
		    
		    Thread.sleep(5000);
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:comparisonPanel1:inputDate1::content"));
		    
		    Thread.sleep(2000);
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:comparisonPanel1:commandButton1::icon"));
		    
		    Thread.sleep(10000);
		    
		    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:comparisonPanel1:SPb']/a/span/span"));
		    
		    Thread.sleep(3000);
		    
		    if (browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAwd::_ttxt")).isDisplayed())
			{
				browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAyes")).click();
			}
		
		    
		    clickElement(By.cssSelector("span.xt4"));
		    
		    Thread.sleep(2000);
		    
		    if (browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAwd::tb")).isDisplayed())
			{
				browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAyes")).click();
			}
		
		    Thread.sleep(2000);
		    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ComparingItemsITC.class);
			run();
		}
	}

}
