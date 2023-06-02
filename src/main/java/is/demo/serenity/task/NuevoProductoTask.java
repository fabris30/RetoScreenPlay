package is.demo.serenity.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static is.demo.serenity.userInterface.NuevoProductoUI.BTN_NUEVO_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NuevoProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_NUEVO_PRODUCTO)
        );
    }
    public static Performable NuevoProductoTask(){
        return  instrumented(NuevoProductoTask.class);
    }
}
