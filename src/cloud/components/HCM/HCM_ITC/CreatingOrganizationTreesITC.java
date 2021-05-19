package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingOrganizationTreesITC extends BaseTest{
	
	public static String TreeCode;
	public static String TreeName;
	public static String Description;
	
	
	private static void run() throws InterruptedException{
		
        clickElement(By.id("pt1:_UISmmLink::icon"));
				
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
		
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
	    

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl14"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::icon"));

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:pt1:AP1:DefName_Create::content"), TreeCode);
	   
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:pt1:AP1:DefCode_Create::content"), TreeName);
	    
        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:pt1:AP1:DefDesc_Create::content"), Description);
	    

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:pt1:AP1:tbb1:1:cni2"));

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:pt1:AP1:tbb1:1:cni2"));

        clickElement(By.cssSelector("span.xpc"));

        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:q2:value10::content"), TreeName);

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:q2::search"));
	    
        Thread.sleep(2000);
        
        clickElement(By.xpath("//*[contains(@id, ':fndTreeSearchVCQueryResultId::db')]"));
        
        Thread.sleep(3000);
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:ATT2:_ATTp:fndTreeSearchVCQueryResultId::db']/table/tbody/tr[1]/td[1]"));
        
//        clickElement(By.cssSelector("td.p_AFFocused.xu5"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:ATT2:_ATTp:commandToolbarButton1::popEl"));
	    
        clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:pt1:AP1:ATT2:_ATTp:cmp2']/td[2]"));	    

        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:TVName::content"), "Test TreeNode");

        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:TVDesc::content"), "Test Current tree");
	    
        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:inputStartDate::content"), "04/20/2017");

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:5:pt1:AP1:tbb1:1:cni2"));
	    
        clickElement(By.id("_FOd1::msgDlg::cancel"));	 
        
       	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:hierCol:addBtn::icon"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:cb1"));

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), "Test123");

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:qryId1::search"));
	    
	   Thread.sleep(1000);
	    
	    clickElement(By.xpath("//*[contains(text(), 'Test123')]"));
	    
//	    clickElement(By.cssSelector("td.p_AFFocused.xu5"));
	    
//	    Thread.sleep(2000);
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));	    

//	    Thread.sleep(2000);
	    
	    clickElement(By.xpath("(//td[contains(@class, 'xe7')])[4]"));
	    
//	    Thread.sleep(2000);
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:hierCol:tt1::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]"));
	    
	    
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:hierCol:addBtn::icon"));

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:cb1"));

        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), "TestPartnerActivation");

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:qryId1::search"));	    

        clickElement(By.xpath("//*[contains(text(), 'TestPartnerActivation')]"));
        
//        clickElement(By.cssSelector("td.p_AFFocused.xu5"));

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));

        
//        clickElement(By.cssSelector("td.p_AFFocused.xu5"));
//
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:hierCol:addBtn::icon"));
//
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:cb1"));
//
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"));
//
//        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:qryId1:value00::content"), "TestTeamDept2");
//	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:qryId1::search"));
//
//	    clickElement(By.cssSelector("td.p_AFFocused.xu5"));
//
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:AH1:addView:r1:0:AT1:_ATp:cb1"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:6:pt1:AP1:APsb2"));

	    clickElement(By.id("_FOd1::msgDlg::cancel"));
	    		
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingOrganizationTreesITC.class);
			run();
		}
	}

}
