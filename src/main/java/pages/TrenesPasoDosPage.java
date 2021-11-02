package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesPasoDosPage extends BasePage{
    private By pasoDos = By.xpath("//*[@id=\"content\"]/article/div[3]/a/span");
    private By mensajeNoDisponible= By.xpath("//div[@class='content-viajes viaje-jorge noExisteViaje']");
    //private By contenidoItinerario= By.xpath("//div[@class='content-viajes viaje-jorge noExisteViaje']");

    public TrenesPasoDosPage(WebDriver driver) {
        super(driver);
    }

    public String mostrarPaso(){
        return driver.findElement(pasoDos).getText();
    }

    public String mostrarMensajeNoDisponible(){
        return driver.findElement(mensajeNoDisponible).getText();


    }

    public String noDisponibles(){
        if (driver.findElement(mensajeNoDisponible).getSize()!=null){

            String s= driver.findElement(mensajeNoDisponible).getText();
            System.out.println(s);

            return driver.findElement(mensajeNoDisponible).getText();
        }else{
            return "Existe";
        }
    }

}
