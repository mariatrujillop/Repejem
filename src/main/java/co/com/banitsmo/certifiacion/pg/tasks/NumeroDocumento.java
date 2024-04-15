package co.com.banitsmo.certifiacion.pg.tasks;


import co.com.banitsmo.certifiacion.pg.models.Valores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.banitsmo.certifiacion.pg.userinterfaces.BarraNavegacion.LNK_NUEVARESERVA;
import static co.com.banitsmo.certifiacion.pg.userinterfaces.BarraNavegacion.TXT_CEDULA;


public class NumeroDocumento implements Task {

    private List<Valores> cedula;

    public NumeroDocumento(List<Valores> cedula){this.cedula = cedula;}



    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(


                WaitUntil.the(TXT_CEDULA, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(cedula.get(1).getCedula()).into(TXT_CEDULA)
        );







}

    public static NumeroDocumento conLosDatos(List<Valores> cedula){
        return Tasks.instrumented(NumeroDocumento.class, cedula);

}
}
