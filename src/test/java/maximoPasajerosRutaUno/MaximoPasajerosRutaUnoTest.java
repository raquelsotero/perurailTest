package maximoPasajerosRutaUno;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class MaximoPasajerosRutaUnoTest extends BaseTest {

    @Test
    public void maximoPasajerosRutaUnoTest(){

        HomePage homePage= new HomePage(driver);

        homePage.seleccionarSoloIda();
        System.out.println("Llegué");

        homePage.seleccionarDestino("Machu Picchu");
        homePage.seleccionarRuta("Cusco > Machu Picchu");
        //homePage.indicarDiaSalida();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        homePage.indicarPasajeros();
        homePage.indicarPasajerosAdulto(9);
        homePage.indicarPasajerosChild(2);



        Assert.assertEquals(homePage.mostrarMensajeError(), "SOLO HASTA 9 TICKETS");




    }
}
