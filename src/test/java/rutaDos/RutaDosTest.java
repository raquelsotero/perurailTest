package rutaDos;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TrenesPasoDosPage;

public class RutaDosTest extends BaseTest {


    @Test
    public void rutaDosTest(){
        TrenesPasoDosPage trenesPasoDosPage= new TrenesPasoDosPage(driver);
        HomePage homePage = new HomePage(driver);


        homePage.seleccionarSoloIda();
        homePage.seleccionarDestino("Puno");
        homePage.seleccionarRuta("Cusco > Puno");
        homePage.mostrarTrenesDisponibles();
        homePage.elegirTren("Cusco > Puno");
        homePage.indicarSalida();
        homePage.elegirFechaActual();


    }
}
