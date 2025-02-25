package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ingjuanfg.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarAutenticacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(USERNAME_INPUT),
                Enter.theValue("secret_sauce").into(PASSWORD_INPUT),
                Click.on(BOTON_LOGIN)
        );
    }

    public static Performable enSaucedemo(){
        return instrumented(RealizarAutenticacion.class);
    }
}
