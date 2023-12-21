package co.com.bancofalabellaempresas.login.userinterfaces;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.serenitybdd.screenplay.targets.Target;
//import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



@DefaultUrl("page:webdriver.base.url")
//@DefaultUrl("https://www.google.com")
public class LoginPage extends  PageObject{

    public static final Target SELECTPRODUCT = Target.the("Selecionar producto")
            .located(By.id("select-product"));

    public static final Target NAVEGADOR = Target.the("navegador")
            .located(By.id("download-info-product"));

@FindBy(id="download-info-product")
public static WebElementFacade NAVEGADOR1;







}

