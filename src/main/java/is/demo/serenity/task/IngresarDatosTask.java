package is.demo.serenity.task;

import is.demo.serenity.utils.Excel;
import is.demo.serenity.utils.ScrollUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static is.demo.serenity.userInterface.IngresarDatosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatosTask implements Task {
    private static ArrayList<Map<String, String>> datosExcel= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("datos/data.xlsx", "Ingresar");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                Enter.theValue(datosExcel.get(0).get("Nombre")+datosExcel.get(0).get("Personaje")).into(TXT_NOMBRE_PRODUCTO),
                Enter.theValue(datosExcel.get(0).get("Stock")).into(TXT_UNIDAD_STOCK),
                Enter.theValue(datosExcel.get(0).get("UnidadesP")).into(TXT_UNIDAD_SOBRE_PEDIDO),
                Enter.theValue(datosExcel.get(0).get("Reorden")).into(TXT_NIVEL_REORDEN),
                ScrollUp.toTop(),
                Click.on(BTN_GUARDAR),
                Enter.theValue(datosExcel.get(0).get("Nombre")+datosExcel.get(0).get("Personaje")).into(TXT_BUSCAR_NOMBRE)

        );

    }

    public static Performable IngresarDatosTask(){
        return  instrumented(IngresarDatosTask.class);
    }
}
