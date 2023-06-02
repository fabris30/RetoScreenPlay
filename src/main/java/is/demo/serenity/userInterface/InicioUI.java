package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {
    public static final Target BTN_INICIO_SESION = Target.the("Inicio de sesion")
            .locatedBy("//button[@id='LoginPanel0_LoginButton']");
}
