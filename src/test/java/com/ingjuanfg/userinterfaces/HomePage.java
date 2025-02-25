package com.ingjuanfg.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {
    public static final Target HOME_TITLE = the("Titulo Home Saucedemo")
            .located(By.xpath("//span[@data-test='title']"));
}
