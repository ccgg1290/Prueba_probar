

package co.com.bancofalabellaempresas.login.stepdefinitions;

import co.com.bancofalabellaempresas.login.tasks.LoginFalabella;
import co.com.bancofalabellaempresas.login.userinterfaces.LoginPage;
import co.com.bancofalabellaempresas.login.utils.KillBrowser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static co.com.bancofalabellaempresas.login.userinterfaces.LoginPage.NAVEGADOR;
import static co.com.bancofalabellaempresas.login.userinterfaces.LoginPage.NAVEGADOR1;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertEquals;
public class StarLoginStepDefinitions {


    @Before
    public void initialConfiguration() {
        //WebDriverManager.chromedriver().setup();
        //ChromeOptions options  = new ChromeOptions();
        //options.addArguments("start-minimized");
        OnStage.setTheStage(new OnlineCast());
    }
    @After
    public static void CloseDriver() throws IOException, InterruptedException {
        //cerrar navegador
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        //cerrartodoslos procesos
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }
    @Given("I want enter to Bancofalabella Empresas")
    public void IwantEnterToBancofalabellaEmpresas() throws InterruptedException {
        OnStage.theActorCalled("User").attemptsTo(
                Open.browserOn().the(LoginPage.class));
    }
    @When("I log in with correct credentials")
    public void ILogIntoWithCorrectCredentials(DataTable data) throws InterruptedException {
        List<Map<String, String>> newdata = data.asMaps();
        //System.out.println(" \n -----------\n --------"+newdata.get(0).get("TipoDeIdentificación"));
        WebDriver driver=getDriver();
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginFalabella.intoPage(getDriver(),newdata)
        );
        Thread.sleep(10000);
    }
    @Then("See my name in the home page")
    public void SeeMyNameInTheHomePage() {
        System.out.println("Target"+NAVEGADOR.getName());
        System.out.println("Target"+NAVEGADOR.getName());
        System.out.println("find by"+NAVEGADOR1.getText());
         assertEquals(NAVEGADOR1.getText(), "Firefox Beta");
        //System.out.println("sirvio");
    }

}

