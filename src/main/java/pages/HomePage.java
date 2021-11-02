package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

// constituida por los localizadores y las acciones con ellos
public class HomePage extends  BasePage {

    //Elementos con los que se va a interactuar
    private By oneWay = By.xpath("//*[@id=\"radioset\"]/div[2]/label");
    //private By roudTrip = By.id("roundtrip");
    private By calendario = By.id("salida");
    private By siguienteMes = By.xpath("//span[contains(text(),'Next')]");
    private By fechaSalida = By.xpath("//a[contains(text(),'30')]");
    private By destino = By.id("destinoSelect");
    private By ruta = By.id("rutaSelect");
    private By masPasajeroAdulto = By.id("adultsAume");
    private By menosPasajeroAdulto = By.id("adultsDism");
    private By pasajeros = By.id("countParentsChildren");
    private By agregaAdulto= By.id("adultsAume");
    private By agregarChild= By.id("childrenAume");
    private By quitarAdulto= By.id("adultsDism");
    private By cantidadAdultoSeleccionado = By.name("adultsSelect");
    private By cerrarPasajero= By.xpath("//a[@class=\"cerrar-passanger\"]");
    private By btnBuscarTren = By.id("btn_search");
    private By mensajeError = By.id("error-pasajeros");
    private By listaDias = By.xpath("//a[@class='ui-state-default']");
    private By mesMostrado = By.cssSelector("#ui-datepicker-div > div > div > span.ui-datepicker-month");
    private By fechaActual = By.className("ui-state-default ui-state-highlight ui-state-active");
    private By tren = By.id("cbTrenSelect");

   // constructor que llama al instructor de la clase padre
    public HomePage(WebDriver driver) {
        super(driver);
    }



    public void seleccionarSoloIda(){
        WebElement soloIda= driver.findElement(oneWay);
        soloIda.click();

    }


    public void seleccionarDestino(String destinoElegido){
        WebElement element = driver.findElement(destino);
        Select selectList = new Select(element);
        selectList.selectByVisibleText(destinoElegido);
    }

    public void seleccionarRuta(String rutaElegida){
        WebElement element = driver.findElement(ruta);
        Select selectList = new Select(element);
        selectList.selectByVisibleText(rutaElegida);
    }



    public void buscarTren(){
        WebElement element = driver.findElement(btnBuscarTren);
        element.click();
    }
    public void indicarPasajeros(){
        WebElement element = driver.findElement(pasajeros);

        element.click();

    }

    public void indicarPasajerosAdulto(int adulto) {
        int i = 1;
        while (i <= adulto) {
            driver.findElement(agregaAdulto).click();

            i++;
        }
    }

    public void indicarPasajerosChild(int child) {
        int i = 1;
        while (i <= child) {
            driver.findElement(agregarChild).click();

            i++;
        }
    }

     public void disminuirPasajeroAdulto(){

         String sinAdulto = driver.findElement(cantidadAdultoSeleccionado).getAttribute("value");
         System.out.println(sinAdulto);
         int i=0;

         while (i<=2){
             driver.findElement(quitarAdulto).click();
             i++;


        }



     }



    public void cerrarSeleccionPasajero(){
        driver.findElement(cerrarPasajero).click();
    }
    public void elegirMes(String mes){


        String mesActual = driver.findElement((mesMostrado)).getText();

        System.out.println(mesActual);

        if (mes== mesActual) {
            driver.findElement(siguienteMes).click();

        }


    }

    public void indicarSalida(){
        driver.findElement(calendario).click();

    }

    public void elegirDia(String fecha){

        List<WebElement> elements = driver.findElements(listaDias);

        for (int i=0; i<elements.size();i++){
            String date = elements.get(i).getText();

            if (date.equals(fecha)){
                elements.get(i).click();
            }
        }

    }

    public String mostrarMensajeError(){
        return driver.findElement(mensajeError).getText();
    }

    public void elegirFechaActual(){
        driver.findElement(fechaActual).click();

    }

    public  void mostrarTrenesDisponibles(){
        driver.findElement(tren).click();

    }

    public void elegirTren(String destinoElegido){
        WebElement element = driver.findElement(tren);
        Select selectList = new Select(element);
        selectList.selectByVisibleText(destinoElegido);



    }





}



