package is.demo.serenity.questions;

import is.demo.serenity.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static is.demo.serenity.userInterface.BuscarProductoUI.LBL_NOMBRE;

public class InsectarExcelQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String producto="";
        try {
            ArrayList<Map<String, String>> datosExcel = Excel.leerDatosDeHojaDeExcel("datos/data.xlsx", "Ingresar");
            producto = datosExcel.get(0).get("Validation");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        String nombreProducto = LBL_NOMBRE.resolveFor(actor).getText();

        return producto.equals(nombreProducto);
    }

    public static Question InsectarExcelQuestion(){
        return new InsectarExcelQuestion();
    }
}
