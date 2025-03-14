package pages;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FBLogin {
    WebDriver driver;
    WebDriverWait wait;

    public FBLogin(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    By email_path=By.xpath("//input[@type='text']");
    By password_path=By.xpath("//div[@id='passContainer']/input");
    By Submit_path=By.xpath("//button[@name='login']");
    By CreateButton_path= By.xpath("(//a[@role='button'])[2]");
    By logo_path=By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']");
    By firstname_path=By.xpath("//input[@type='text' and @name='firstname']");
    By Surname_path=By.xpath("//input[@type='text' and @name='lastname']");
    By Birth_day_path=By.xpath("//select[@name='birthday_day']");
    By month_day_path=By.xpath("//select[@name='birthday_month']");
    By year_path=By.xpath("//select[@name='birthday_year']");
    By radiobutton_path=By.xpath("//input[@type='radio' and @value='2']");
    By emai_phn_path=By.xpath("//input[@name='reg_email__']");
    By new_password=By.xpath("//input[@id='password_step_input']");
    By signup_path=By.xpath("//button[@name='websubmit']");

    public void login()
    {
        WebElement email =driver.findElement(email_path);
        WebElement password =driver.findElement(password_path);
        WebElement submit =driver.findElement(Submit_path);
        email.sendKeys("girijakumar736@gmail.com");
        password.sendKeys("girija@2002");
        submit.click();
    }
    public void signup()
    {
        //variables initilization
        WebElement createbutton=driver.findElement(CreateButton_path);
        createbutton.click();

        WebElement FirstName=driver.findElement(firstname_path);
        WebElement  logopath=driver.findElement(logo_path);
        WebElement Surname=driver.findElement(Surname_path);
        WebElement radiobutton=driver.findElement(radiobutton_path);
        WebElement emai_phn=driver.findElement(emai_phn_path);
        WebElement newpassword=driver.findElement(new_password);
        WebElement signup=driver.findElement(signup_path);
        //operations on the variables
        if(logopath.isDisplayed())
        {
            FirstName.sendKeys("Harish");
            Surname.sendKeys("Sabbavarapu");
            dateOfBirth();
            radiobutton.click();//male
            emai_phn.sendKeys("1234567890");
            newpassword.sendKeys("Hello@123");
            signup.click();
        }else
        {
            System.out.println("No logo is displayed");
        }


    }
    void dateOfBirth()
    {
        WebElement Birthday=driver.findElement(Birth_day_path);
        WebElement month1=driver.findElement(month_day_path);
        WebElement year1=driver.findElement(year_path);
        Select Day=new Select(Birthday);
        Select month=new Select(month1);
        Select year=new Select(year1);
        Day.selectByValue("22");
        month.selectByIndex(10);
        year.selectByVisibleText("2002");
    }



}



