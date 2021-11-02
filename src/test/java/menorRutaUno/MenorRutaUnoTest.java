package menorRutaUno;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class MenorRutaUnoTest extends BaseTest {



    @Test
    public void menorRutaUnoTest(){
        HomePage homePage =new HomePage(driver);

        homePage.seleccionarSoloIda();
        homePage.seleccionarDestino("Machu Picchu");
        homePage.seleccionarRuta("Cusco > Machu Picchu");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        homePage.indicarPasajeros();
        homePage.indicarPasajerosChild(1);
        homePage.disminuirPasajeroAdulto();








    }
}
