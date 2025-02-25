package com.ingjuanfg.interactions;

import com.ingjuanfg.userinterfaces.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Interaction {

    @Page
    LoginPage loginPage;

    @Override
    @Step("Abrir el navegador para ejecucion de pruebas")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(loginPage)
        );
    }

    public static Performable elNavegador(){
        return instrumented(Abrir.class);
    }
}
