package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class IrCrearProductoUI {

    public static final Target BTN_MAS_INFORMACION = Target.the("boton de mas informacion")
            .locatedBy("(//a[@class='card-footer'])[4]");
}
