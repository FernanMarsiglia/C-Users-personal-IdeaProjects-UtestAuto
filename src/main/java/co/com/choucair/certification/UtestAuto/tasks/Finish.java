package co.com.choucair.certification.UtestAuto.tasks;

import co.com.choucair.certification.UtestAuto.userinterface.FinishtheRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Finish implements Task {
    public static Finish theRegistration() {
        return Tasks.instrumented(Finish.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attempsTo(if((FinishtheRegistrationPage.CONFIRM_PAGE).isDisplayed()) {
                            Enter.theValue("Guayabon123.").into(FinishtheRegistrationPage.INPUT_PASSWORD);
                            Enter.theValue("Guayabon123.").into(FinishtheRegistrationPage.CONFIRM_PASSWORD);
                            Click.on(FinishtheRegistrationPage.TERMSOFUSE);
                            Click.on(FinishtheRegistrationPage.TERMSOFPRIV);
                            Click.on(FinishtheRegistrationPage.COMPLETESETUP_BUTTON);
                            Thread.sleep(2000);
                        }
                        else{
                            System.out.print("Register last page was not found");
                        }
        );
    }
}
