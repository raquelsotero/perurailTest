package sinItinerarioDisponible;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TrenesPasoDosPage;

import java.util.concurrent.TimeUnit;

public class SinItinerarioDisponibleTest extends BaseTest {

    @Test
    public void sinItinerarioDisponibleTest() {

        TrenesPasoDosPage trenesPasoDosPage= new TrenesPasoDosPage(driver);
        HomePage homePage = new HomePage(driver);


        homePage.seleccionarSoloIda();

        homePage.seleccionarDestino("Machu Picchu");
        homePage.seleccionarRuta("Cusco > Machu Picchu");
        homePage.indicarSalida();
        homePage.elegirDia("2");
        homePage.indicarPasajeros();
        homePage.indicarPasajerosAdulto(1);
        homePage.indicarPasajerosChild(1);
        homePage.cerrarSeleccionPasajero();


        homePage.buscarTren();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        Assert.assertEquals(trenesPasoDosPage.mostrarPaso(), "2");
        Assert.assertEquals(trenesPasoDosPage.noDisponibles(), "Por favor, inténtelo nuevamente o seleccione otra fecha.");


    }


    }
