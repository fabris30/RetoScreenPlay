package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class NuevoProductoUI {

    public static final Target BTN_NUEVO_PRODUCTO = Target.the("crear nuevo producto")
            .locatedBy("//i[@class='fa fa-plus-circle text-green']");
}
