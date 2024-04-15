package co.com.banitsmo.certificacion.pg.stepdefinitions;

import co.com.banitsmo.certifiacion.pg.models.Valores;
import co.com.banitsmo.certifiacion.pg.tasks.NavegacionPagina;
import co.com.banitsmo.certifiacion.pg.tasks.NumeroDocumento;
import co.com.banitsmo.certifiacion.pg.utils.Chrome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PruebaXStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());

    }

    @Given("^ingrese a la pagina de bancolombia$")
    public void ingreseALaPaginaDeBancolombia() {
        OnStage.theActorCalled("Maria").can(BrowseTheWeb.with(Chrome.in().pruebaA()));
    }

    @When("^ingresar boton Solicitar Turno y luego nueva reserva$")
    public void ingresarBotonSolicitarTurnoYLuegoNuevaReserva() {
        theActorInTheSpotlight().attemptsTo(NavegacionPagina.Enter());
    }


    @When("^ingresar el numero de documento$")
    public void ingresarElNumeroDeDocumento(List<Valores> cedula) {
        theActorInTheSpotlight().attemptsTo(NumeroDocumento.conLosDatos(cedula));
    }





    }


