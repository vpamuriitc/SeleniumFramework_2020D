package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingDocumentTypesITC extends BaseTest{
	
	public static String ProjectType;
	public static String DocumentType_Name;
	public static String Comments;
	public static String Country;
	
	private static void run(){
		
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:nv_moreLk"));
		
		clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
		
		setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s1:it1::content"), ProjectType);
		
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s1:ctb1::icon"));
	    
	    clickElement(By.id("pt1:r1:0:r0:1:AP1:t1:0:cl2"));
	    
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:0:AP1:pc1:ctb1']/a/span"));
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:inputText3::content"), DocumentType_Name);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:territoryShortNameId::content"));
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:territoryShortNameId::content"), Country);
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:inputText2::content"), Comments);
	    
	    	    
	    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:soc1::content"))).selectByVisibleText("Licenses and certificates");
	    
	    clickElement(By.cssSelector("option[title=\"Licenses and certificates\"]"));
	    
	        
	    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:soc2::content"))).selectByVisibleText("Personal");
	    
	    clickElement(By.cssSelector("option[title=\"Personal\"]"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:selectOneRadio2:_1"));
	    
	    clickElement(By.cssSelector("span.x1gs"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:tt1:okWarningDialog"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:Docum1:1:AP3:tt1:okConfirmationDialog"));
	    
	    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDocumentTypesITC.class);
			run();
		}
	}

}
