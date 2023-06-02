package is.demo.serenity.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static is.demo.serenity.userInterface.InicioUI.BTN_INICIO_SESION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                Click.on(BTN_INICIO_SESION)
        );
    }

    public static Performable InicioTask(){
        return  instrumented(InicioTask.class);
    }

}
