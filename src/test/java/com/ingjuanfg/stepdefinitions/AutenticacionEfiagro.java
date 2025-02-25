package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.interactions.Abrir;
import com.ingjuanfg.interactions.Maximizar;
import com.ingjuanfg.tasks.RealizarAutenticacion;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.ingjuanfg.userinterfaces.HomePage.HOME_TITLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

@ExtendWith(SerenityJUnit5Extension.class)
public class AutenticacionEfiagro {

    @Test
    @DisplayName("Login en Saucedemo con Usuario Standard")
    public void autenticacionSaucedemo() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").wasAbleTo(
                Abrir.elNavegador(),
                Maximizar.elNavegador(),
                RealizarAutenticacion.enSaucedemo(),
                Ensure.that(HOME_TITLE).isDisplayed()
        );
    }
}
