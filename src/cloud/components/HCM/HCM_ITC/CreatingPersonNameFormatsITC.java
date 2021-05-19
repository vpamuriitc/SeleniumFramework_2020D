package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import itc.framework.BaseTest;

public class CreatingPersonNameFormatsITC extends BaseTest{

	public static String Search_Tasks_Name;
	public static String First_Name;
	public static String Second_Name;
	public static String Country;



	private static void run() throws InterruptedException{


		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));

		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"));

		setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"), Search_Tasks_Name);

		clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));

		clickElement(By.linkText("Manage Person Name Formats"));

		Thread.sleep(8000);

		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:pc1:ctb4::icon"));

		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:territoryShortNameId::content"));

		setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:territoryShortNameId::content"), Country);

		Thread.sleep(3000);

		clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:ctb2::popEl"));

		Thread.sleep(3000);


		clickElement(By.xpath("//td[contains(@class,'x2h') and @id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:soc1::content')]"));

		//clickElement(By.xpath("//select[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:AP2:soc1::content']"));

		Thread.sleep(2000);


		clickElement(By.cssSelector("option[title=\"Display name\"]"));


		Thread.sleep(5000);

		clickElement(By.xpath("//img[contains(@title, 'Remove Selected Items')]"));
		//clickElement(By.id("pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:button3::icon"));

		Thread.sleep(10000);

		clickElement(By.xpath("//td[contains(@class,'xe9')]//span[contains(text(), 'First Name')]"));

		//clickElement(By.xpath("//table[@id='pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:create2:0:pgl11']/tbody/tr/td/span"));

		Thread.sleep(8000);

		clickElement(By.xpath("//img[contains(@title, 'Move to Other List')]"));
		//clickElement(By.id("pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:button4::icon"));

		Thread.sleep(10000);


		clickElement(By.xpath("//td[contains(@class,'xe9')]//span[contains(text(), 'Last Name')]"));
		//clickElement(By.xpath("//table[@id='pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:create2:3:pgl11']/tbody/tr/td/span"));

		Thread.sleep(10000);


		clickElement(By.xpath("//img[contains(@title, 'Move to Other List')]"));
		//clickElement(By.id("pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:button4::icon"));
		Thread.sleep(10000);


		clickElement(By.xpath("//input[contains(@value,'First_Name')]"));
		//clickElement(By.id("pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:table2:0:text1::content"));

		Thread.sleep(2000);

		setElementText(By.xpath("//input[contains(@value,'First_Name')]"), First_Name);

		Thread.sleep(2000);

		clickElement(By.xpath("//input[contains(@value,'Last_Name')]"));
		//clickElement(By.id("pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:table2:1:text1::content"));

		setElementText(By.xpath("//input[contains(@value,'Last_Name')]"), Second_Name);

		Thread.sleep(3000);

		clickElement(By.linkText("S"));
		//clickElement(By.xpath("//div[@id='pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:ctb2']/table/tbody/tr/td/a/span"));

		clickElement(By.xpath("//div[@id='pt1:r1:0:rt:0:r2:0:dynamicRegion1:1:AP2:activeCommandToolbarButton1']/a/span"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingPersonNameFormatsITC.class);
			run();
		}
	}

}




