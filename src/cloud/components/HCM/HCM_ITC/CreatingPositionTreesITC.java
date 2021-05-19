package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingPositionTreesITC extends BaseTest{
	
	public static String Tree_Name;
	public static String Tree_Code;
	public static String Desc;
	public static String Tree_Version_Name;
	public static String Tree_Version_Desc;
	public static String Start_Date;
	public static String Search_Node_1;
	public static String Search_Node_2;
	public static String Search_Node_3;
	
	
	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
	    clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl2"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefName_Create::content"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefName_Create::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefName_Create::content"), Tree_Name);
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefCode_Create']/td[2]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefCode_Create::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefCode_Create::content"), Tree_Code);
	    
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefDesc_Create::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:DefDesc_Create::content"), Desc);
	    
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:tbb1:1:cni2"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:pt1:AP1:tbb1:1:cni2"));
	    
	    clickElement(By.cssSelector("span.xt4"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2:value10::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2:value10::content"), Tree_Name);
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:q2::search"));
	    
	    Thread.sleep(15000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl"));
	    
	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:pt1:AP1:ATT2:_ATTp:cmp2']/td[2]"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVName::content"), Tree_Version_Name);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVDesc::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:TVDesc::content"),Tree_Version_Desc );
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:inputStartDate::content"), Start_Date);
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:4:pt1:AP1:tbb1:1:cni2"));
	    
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    
	    Thread.sleep(8000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:cb1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Search_Node_1);
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1::search"));
	    
	    Thread.sleep(8000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db"));
	    
	    Thread.sleep(8000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:cb1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Search_Node_2);

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1::search"));
	    
	    Thread.sleep(8000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db"));
	    
	    clickElement(By.cssSelector("td.p_AFFocused.xz4"));
	    
	    Thread.sleep(8000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:hierCol:tt1:0::di"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:hierCol:addBtn::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:cb1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), Search_Node_3);

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:qryId1::search"));
	    
	    Thread.sleep(8000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:resId1::db"));
	    
	    Thread.sleep(8000); 
	    
	    clickElement(By.cssSelector("td.p_AFFocused.xz4"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:AH1:hierCol:tt1:1::di"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:APsb2"));
	    
	    clickElement(By.id("_FOd1::msgDlg::cancel"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingPositionTreesITC.class);
			run();
		}
	}

}
