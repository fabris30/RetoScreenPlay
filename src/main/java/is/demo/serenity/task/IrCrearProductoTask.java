package is.demo.serenity.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static is.demo.serenity.userInterface.IrCrearProductoUI.BTN_MAS_INFORMACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrCrearProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_MAS_INFORMACION)
        );
    }
    public static Performable IrCrearProductoTask(){
        return  instrumented(IrCrearProductoTask.class);
    }
}
