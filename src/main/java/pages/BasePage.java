package pages;


import org.openqa.selenium.WebDriver;


//Abstracta para que las demás hereden de esta
public abstract  class BasePage {
    protected WebDriver driver;


    // Constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

}
