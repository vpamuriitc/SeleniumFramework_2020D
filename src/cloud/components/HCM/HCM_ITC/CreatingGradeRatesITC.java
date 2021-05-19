package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingGradeRatesITC extends BaseTest{
	
	public static String Legislative_Data_Group ;
	public static String Name;
	public static String Grade;
	public static String Minimum;
	public static String Maximum;
	
	
	private static void run() throws InterruptedException{
		
		
		 	clickElement(By.id("pt1:_UISmmLink::icon"));
		    
		    clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
		  
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl6"));
		 
		    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP4:AT5:_ATp:commandToolbarButton1']/a/span"));
		  
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP4:AT5:legislativeDataGroupNameId::content"));
		    
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP4:AT5:legislativeDataGroupNameId::content"), Legislative_Data_Group);
		    
		 
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP4:AT5:commandButton2"));
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP4:AT5:commandButton2"));
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:inputText2::content"));
		    
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:inputText2::content"), Name);
		    
		    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:addRateValueinCreate']/a/span"));
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:t1:0:nameId::content"));
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:t1:0:nameId::content"));
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:t1:0:nameId::content"), Grade);
		   
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:t1:0:it2::content"));
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:t1:0:it2::content"), Minimum);
		   
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:t1:0:it3::content"));
		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:createGrdRateValuesApplTable:_ATp:t1:0:it3::content"), Maximum);
		    
		    Thread.sleep(5000);
		    
		   
		    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP2:tt1:review']/a/span"));
		    
		    Thread.sleep(15000);
		   
		    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP1:tt1:submit']/a/span/span"));
		    
		    Thread.sleep(5000);
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP1:tt1:okWarningDialog"));
		    
		    Thread.sleep(3000);
		   
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP1:scOk"));
		    
		    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingGradeRatesITC.class);
			run();
		}
	}

}
