package co.com.banitsmo.certifiacion.pg.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BarraNavegacion {


      public static final Target LNK_SOLICITARTURNO = Target.the("Link Solicitar Turno").located(By.xpath("(//*[@id='btn-home-recomendados'])[6]"));
      public static final Target LNK_NUEVARESERVA = Target.the("Link Nueva Reserva").located(By.xpath("/html/body/app-root/div/div[2]/ng-component/div/app-welcome/div/div[4]/div[1]/div[2]/div/div[2]/button"));
      public static final Target TXT_CEDULA = Target.the("Link Nueva Reserva").located(By.xpath("//*[@id='02']"));


}