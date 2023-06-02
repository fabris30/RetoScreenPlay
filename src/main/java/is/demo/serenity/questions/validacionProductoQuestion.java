package is.demo.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static is.demo.serenity.userInterface.BuscarProductoUI.LBL_NOMBRE;

public class validacionProductoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        return LBL_NOMBRE.resolveFor(actor).isVisible();
    }

    public static Question validacionProducto(){
        return new validacionProductoQuestion();
    }
}
