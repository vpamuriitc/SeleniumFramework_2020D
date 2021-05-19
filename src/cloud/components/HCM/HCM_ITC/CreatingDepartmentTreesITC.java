package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDepartmentTreesITC extends BaseTest{

	public static String Tree_Name;
	public static String Tree_Code;
	public static String Tree_Name_1;
	public static String Tree_Name_2;
	public static String Start_Date;
	

	private static void run() throws InterruptedException{
		
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		Thread.sleep(15000);
	    
	    clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl11"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefName_Create::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefName_Create::content"), Tree_Name);
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefCode_Create::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefCode_Create::content"), Tree_Code);
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:tbb1:1:cni2"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:pt1:AP1:tbb1:1:cni2"));
	
	    clickElement(By.cssSelector("span.xt4"));
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2:value10::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2:value10::content"), Tree_Name);


	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2::search"));
	    
	    Thread.sleep(8000);
	  
	    clickElement(By.cssSelector("td.xz4"));
	    
	    Thread.sleep(8000);
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl"));

	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:cmp2']/td[2]"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"), Tree_Name_1);
	    
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"));
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"), Start_Date);
	   
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));

	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:APsb2"));
	 
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl"));
	    
	    Thread.sleep(3000);

	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:cmp2']/td[2]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"), Tree_Name_2);

	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"));
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"), Start_Date);
	 
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));
	   
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn::icon"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:nodeTypeRadio:_1"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:addDiag::ok"));
	 
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:APsb2"));
	  
	    clickElement(By.id("_FOd1::msgDlg::cancel"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDepartmentTreesITC.class);
			run();
		}
	}

}




