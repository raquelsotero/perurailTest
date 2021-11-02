package sinCabinasRutaDos;

import base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CabinasPasoDosPage;
import pages.HomePage;
import pages.TrenesPasoDosPage;

import java.util.concurrent.TimeUnit;

public class SinCabinaRutaDosTest extends BaseTest {


    @Test
    public void rutaDosTest(){
        HomePage homePage = new HomePage(driver);
        CabinasPasoDosPage cabinasPasoDosPage= new CabinasPasoDosPage(driver);


        homePage.seleccionarSoloIda();
        homePage.seleccionarDestino("Puno");
        homePage.seleccionarRuta("Cusco > Puno");
        homePage.mostrarTrenesDisponibles();
        homePage.elegirTren("Andean Explorer, A Belmond Train");
        homePage.indicarSalida();
        homePage.elegirDia("2");
        homePage.buscarTren();

        Assert.assertEquals(cabinasPasoDosPage.sinCabinasDisponibles(),"No hay Cabinas Disponibles");



    }
}
