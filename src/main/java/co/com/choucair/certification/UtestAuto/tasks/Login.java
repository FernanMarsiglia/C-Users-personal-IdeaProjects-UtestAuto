package co.com.choucair.certification.UtestAuto.tasks;

import co.com.choucair.certification.UtestAuto.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;

public class Login implements Task{
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attempsTo(Enter.theValue("Fernan A").into(UtestLoginPage.INPUT_USERFIRSTNAME);
            Enter.theValue("Marsiglia H").into(UtestLoginPage.INPUT_USERLASTNAME);
            Enter.theValue("feramh96@hotmail.com").into(UtestLoginPage.INPUT_EMAILADDRESS);
            Click.on(UtestLoginPage.SELECT_MONTHBIRTH);
            Click.on(UtestLoginPage.SELECT_DAYBIRTH);
            Click.on(UtestLoginPage.SELECT_YEARBIRTH);
            Click.on(UtestLoginPage.NEXT_BUTTON);
            Thread.sleep(2000);
        );
    }
}
