
package co.com.bancofalabellaempresas.login.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static co.com.bancofalabellaempresas.login.userinterfaces.LoginPage.*;

import net.serenitybdd.screenplay.actions.SelectFromOptions;
public class LoginFalabella implements Task {
    private final WebDriver driver;
    private final List<Map<String, String>> data;
    public LoginFalabella(WebDriver driver, List<Map<String, String>> data) {
        this.driver = driver;
        this.data = data;
    }
    public static LoginFalabella intoPage(WebDriver driver, List<Map<String, String>> data) {
        return Tasks.instrumented(LoginFalabella.class,driver,data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        OnStage.theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(CLIENTE_EMPRESARIAL, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                //Enter.theValue(data.get(0).get("ClienteEmpresarial")).into(CLIENTE_EMPRESARIAL),
                //Click.on(BTN_SIGIN)
                SelectFromOptions.byVisibleText("Firefox Beta").from(SELECTPRODUCT)

        );
    }
}
