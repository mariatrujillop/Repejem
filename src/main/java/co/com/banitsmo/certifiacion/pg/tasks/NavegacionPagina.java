package co.com.banitsmo.certifiacion.pg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.banitsmo.certifiacion.pg.userinterfaces.BarraNavegacion.LNK_NUEVARESERVA;
import static co.com.banitsmo.certifiacion.pg.userinterfaces.BarraNavegacion.LNK_SOLICITARTURNO;

public class NavegacionPagina implements Task {


    @Override
        public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LNK_SOLICITARTURNO, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Scroll.to(LNK_SOLICITARTURNO).andAlignToTop(),
                Click.on(LNK_SOLICITARTURNO),
                WaitUntil.the(LNK_NUEVARESERVA, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(LNK_NUEVARESERVA)


                );






    }

    public static NavegacionPagina Enter() {
        return Tasks.instrumented(NavegacionPagina.class);

    }

}
