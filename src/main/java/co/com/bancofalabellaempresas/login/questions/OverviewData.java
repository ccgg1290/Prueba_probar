package co.com.bancofalabellaempresas.login.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.bancofalabellaempresas.login.userinterfaces.LoginPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.EnumValues;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.Matchers.is;


public class OverviewData {

  public static Question<String> creditAvailable() {
    return actor -> TextContent.of(NAVEGADOR).answeredBy(actor).toString().trim();
  }

  public static Question<String> totalBalance() {
    return actor -> TextContent.of(NAVEGADOR).answeredBy(actor).toString();
  }

}