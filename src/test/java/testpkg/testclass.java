package testpkg;

import org.testng.annotations.Test;

import basepkg.baseclass;
import excelutility.utility;
import pagepkg.Pageclass;
import excelutility.utility;

public class testclass extends baseclass{
	@Test
	public void functions()throws Exception

{Pageclass ob=new Pageclass(driver);


	
	
	String expec="https://wiseroots.in/";
	String actual=driver.getCurrentUrl();
	if(actual.equalsIgnoreCase(expec))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	ob.setvalues();
    ob.refresh();
	ob.homeclick();
	ob.scrolldown();
	ob.product01click();
	ob.addtocart();
	ob.viewcartclick();
	ob.scrolldown01();
	ob.updatecartclick();
	ob.back();
	
	ob.shopclick();
	//ob.sortclick();
	ob.scrolldown01();
	ob.filterclick();
	ob.skincareclick();
	ob.productsclick();
	ob.scrolldownbottom();
	ob.bottomhomeclick();
	ob.contactclick();
	ob.form();
	ob.back();
	ob.searchitem();
	ob.back();
    ob.scrolldown();
	ob.haircareclick();
	ob.product02click();
	ob.scrolldown01();
	ob.addwishlist();
	ob.logoutfield();
	ob.scrolldown01();
	String xl="D:\\project.xlsx";
	String sheet="sheet1";
	int rowCount=utility.getRowCount(xl, sheet);
	for(int i=1;i<=rowCount;i++)
		
	{
		ob.unclearclick();
					
		String UserName=utility.getCellValue(xl, sheet, i,0);
		System.out.println("username---"+UserName);
		ob.psclearclick();
		String Pwd=utility.getCellValue(xl, sheet, i, 1);
		System.out.println("pass---"+Pwd);
		ob.relog(UserName, Pwd);
		ob.resignin();
		ob.refresh();
		
		
	}
   }
}
