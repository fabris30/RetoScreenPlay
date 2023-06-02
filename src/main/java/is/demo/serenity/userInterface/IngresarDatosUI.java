package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class IngresarDatosUI {
    public static final Target TXT_NOMBRE_PRODUCTO = Target.the("Ingresar nombre del producto")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_ProductDialog9_ProductName']");

    public static final Target TXT_UNIDAD_STOCK = Target.the("Ingresar unidad de stock")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitsInStock']");

    public static final Target TXT_UNIDAD_SOBRE_PEDIDO = Target.the("Ingresar unidad sobre pedido")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder']");

    public static final Target TXT_NIVEL_REORDEN = Target.the("Ingresar nivel de reorden")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_ProductDialog9_ReorderLevel']");

    public static final Target BTN_GUARDAR = Target.the("Guardar los datos ingresados")

            .locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");
    public static final Target TXT_BUSCAR_NOMBRE = Target.the("Busca el prodcuto recien guardado")

            .locatedBy("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']");

}
