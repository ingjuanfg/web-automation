package com.ingjuanfg.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage extends PageObject {
    public static final Target USERNAME_INPUT = the("Campo para ingresar Usuario")
            .located(By.id("user-name"));
    public static final Target PASSWORD_INPUT = the("Campo Password")
            .located(By.id("password"));
    public static final Target BOTON_LOGIN =  the("Boton Entrar")
            .located(By.id("login-button"));
}
