package is.demo.serenity.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import is.demo.serenity.questions.*;
import is.demo.serenity.task.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CrearProductoStepDefinition {

    @Before
    public void setStage(){

        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingrese a la url del navegador")
    public void queElUsuarioIngreseALaUrlDelNavegador() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
        );
    }
    @Cuando("el usuario inicie sesion")
    public void elUsuarioInicieSesion() {
        theActorInTheSpotlight().attemptsTo(
                InicioTask.InicioTask()

        );

    }
    @Cuando("presione en mas informacion en tipos de cuenta")
    public void presioneEnMasInformacionEnTiposDeCuenta() {

        theActorInTheSpotlight().attemptsTo(
                IrCrearProductoTask.IrCrearProductoTask()

        );
    }
    @Cuando("presione en crear nuevo producto")
    public void presioneEnCrearNuevoProducto() {

        theActorInTheSpotlight().attemptsTo(
                NuevoProductoTask.NuevoProductoTask()

        );
    }
    @Cuando("llena los datos del producto y los guarda")
    public void llenaLosDatosDelProductoYLosGuarda()  {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosTask.IngresarDatosTask()

        );

    }
    @Entonces("se podra visualizar el producto creado")
    public void sePodraVisualizarElProductoCreado() {

        theActorInTheSpotlight().should(
                seeThat(
                        "Se visualiza el productoo",
                        validacionProductoQuestion.validacionProducto(),
                       // InsectarExcelQuestion.InsectarExcelQuestion(),
                        Matchers.equalTo(true)

                )
        );

    }
}
