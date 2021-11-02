package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CabinasPasoDosPage extends BasePage{



    private By sinCabinas = By.xpath("//div[@class='btn-container']");

    public CabinasPasoDosPage(WebDriver driver) {
        super(driver);
    }




    public String sinCabinasDisponibles() {

        List<WebElement> elements = driver.findElements(sinCabinas);


            if (elements.size() == 3) {

                return "No hay Cabinas Disponibles";
            }else {

                return  "Hay Cabinas Disponibles";
            }




    }




}
