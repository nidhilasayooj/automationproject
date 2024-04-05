package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageclass {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"masthead\"]/div/section[3]/div/div/div/section/div/div[3]/div/div[2]/div/div/a/i")
	WebElement profile;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[1]/ul/li[2]")
	WebElement signin;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/form/div[1]/div/input")
	WebElement email;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/input")
	WebElement username;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/form/button")
	WebElement resign;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div/input")
	WebElement pass;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/form/div[2]/div/input")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/form/div[3]/div/input")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/form/div[4]/div/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/form/div[5]/div/input")
	WebElement confirmpassword;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/form/div[6]/div/label/input")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div[3]/div/form/button")
	WebElement signup;
	@FindBy(xpath="//*[@id=\"goal-breadscrumb\"]/div/div/div/div/ol/li[1]/a")
	WebElement home;
	@FindBy(xpath="/html/body/div[2]/section/div/div/div/div/section[2]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/figure/a/img")
	WebElement product01;
	@FindBy(xpath="/html/body/div[2]/section[2]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/form/button")
	WebElement addcart01;
	@FindBy(xpath="/html/body/div[2]/header/div/section[3]/div/div/div/section/div/div[3]/div/div[3]/div/div/div[1]/div/div/div[1]/div/div/div[2]/p[2]/a[1]")
	WebElement viewcart01;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/div[3]/div[1]/form/table/tbody/tr[1]/td[4]/div/input[3]")
	WebElement plusbutton;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/div[3]/div[1]/form/table/tbody/tr[2]/td")
	WebElement updatecart;
	@FindBy(xpath="//*[@id=\"main\"]/div/section[2]/div/div/div/div/div/div/div/div[1]/ul/li[2]/a")
	WebElement haircare;
	@FindBy(xpath="/html/body/div[2]/section/div/div/div/div/section[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/figure/a/img")
	WebElement product02;
	@FindBy(xpath="/html/body/div[2]/section[2]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div[1]/div/a/i")
	WebElement wishlist;
	@FindBy(xpath="//*[@id=\"goal-breadscrumb\"]/div/div/div/ol/li[1]/a")
	WebElement hom;
	@FindBy(xpath="/html/body/div[2]/header/div/section[3]/div/div/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/a")
	WebElement shop;
	@FindBy(xpath="/html/body/div[2]/section[1]/div/div/div/ol/li[1]/a")
	WebElement homie;
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/form/select")
	WebElement sort;
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div[1]/aside/aside[2]/form/div/div[2]/button")
	WebElement filter;
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div[1]/aside/aside[3]/div/a")
	WebElement skincare;
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div[1]/aside/aside[3]/ul/li[2]/div[1]/a/img")
	WebElement products;
	@FindBy(xpath="/html/body/div[3]/div/div/section[1]/div/div[2]/div/section/div/div[1]/div/div/div/div/div/div/ul/li[1]/a")
	WebElement bottomhome;
	@FindBy(xpath="/html/body/div[2]/header/div/section[3]/div/div/div/section/div/div[2]/div/div/div/div/nav/ul/li[4]/a")
	WebElement contact;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/section[1]/div/div[2]/div/div/div/div/form/div[2]/div[1]/input")
	WebElement name;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/section[1]/div/div[2]/div/div/div/div/form/div[2]/div[2]/input")
	WebElement number;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/section[1]/div/div[2]/div/div/div/div/form/div[2]/div[3]/input")
	WebElement mail;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/section[1]/div/div[2]/div/div/div/div/form/div[3]/button")
	WebElement ok;
	@FindBy(xpath="/html/body/div[2]/header/div/section[3]/div/div/div/section/div/div[3]/div/div[1]/div/div/span/i")
	WebElement search;
	@FindBy(xpath="/html/body/div[2]/header/div/section[3]/div/div/div/section/div/div[3]/div/div[1]/div/div/div[1]/div/form/div[2]/div/span/input[2]")
	WebElement searchfield;
	@FindBy(xpath="/html/body/div[2]/header/div/section[3]/div/div/div/section/div/div[2]/div/div/div/div/nav/ul/li[5]/a")
	WebElement logout;
	@FindBy(xpath="/html/body/div[1]/section[2]/div/div/div/div/nav/ul/li[6]/a")
	WebElement logoutclick;
	public Pageclass(WebDriver driver)
		{
	    	        this.driver=driver;
	    			PageFactory.initElements(driver, this);			
		}
	public void setvalues()
	{
		profile.click();
		signin.click();
		email.sendKeys("nikhil123@gmail.com");
		firstname.sendKeys("ammu");
		lastname.sendKeys("appu");
	    password.sendKeys("ammuappu");
	    confirmpassword.sendKeys("ammuappu");
	    checkbox.click();
	    signup.click();
	    
	
	}
	
	public void refresh()
	{
		driver.navigate().refresh();	
	}
	public void homeclick()
	{WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"goal-breadscrumb\"]/div/div/div/div/ol/li[1]/a")));
		try 
	{ 
		home.click();
	}catch(StaleElementReferenceException e)
	{
	driver.navigate().refresh();
	home.click();
	}
	}
	public void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
	}
	public void scrolldown01()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}
	public void product01click()
	{
		product01.click();
	}
	public void addtocart()
	{
		addcart01.click();
	}
	public void viewcartclick()
	{
		
		viewcart01.click();
	}public void updatecartclick()
	{
		
		plusbutton.click();
		updatecart.click();
	}
	public void back()
	{
		driver.navigate().back();
	}
	public void haircareclick()
	{
		haircare.click();
	}
	public void product02click()
	{
		product02.click();
		
	}
	public void addwishlist()
	{
		wishlist.click();
		hom.click();
	}
	public void shopclick()
	{
		shop.click();
	}
	public void sortclick()
	{
		sort.click();
		Select sortdetails=new Select(sort);
		sortdetails.selectByValue("SORT BY POPULARITY");
		//sortdetails.selectByIndex(2);	
	}
	public void filterclick()
	{
		filter.click();
	}
	public void skincareclick()
	{
		skincare.click();
	}
	public void productsclick()
	{
		products.click();
	}
	public void scrolldownbottom()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void bottomhomeclick()
	{
		bottomhome.click();
	}
	public void contactclick()
	{
		contact.click();
	}
	public void form()
	{
		name.sendKeys("nidhi");
		number.sendKeys("48654434556");
		mail.sendKeys("abc@gmail.com");
		ok.click();
				
	}
	public void searchitem()
	{
		search.click();
		searchfield.sendKeys("haircare");
		searchfield.submit();
	}
	public void logoutfield()
	{
		logout.click();
		logoutclick.click();
	}
	public void relog(String un,String pwd)
	{
		username.sendKeys(un);
		pass.sendKeys(pwd);
	}
	public void unclearclick()
	{
		username.clear();
	}public void psclearclick()
	{
		pass.clear();
		
	}
	public void resignin()
	{
		resign.click();
	}
	
	
	
	
	
	
}
