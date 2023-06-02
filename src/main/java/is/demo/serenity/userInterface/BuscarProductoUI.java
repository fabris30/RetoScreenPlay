package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarProductoUI {
    public static final Target LBL_NOMBRE = Target.the("Buscar producto para validar")

            .locatedBy("//div/a[@class='s-EditLink s-Demo-Northwind-ProductLink']");
}
