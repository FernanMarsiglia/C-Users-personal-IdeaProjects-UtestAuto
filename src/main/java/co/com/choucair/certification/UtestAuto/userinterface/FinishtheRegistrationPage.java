package co.com.choucair.certification.UtestAuto.userinterface;

import net.serenitybdd.core.pages.PageObject;

public class FinishtheRegistrationPage extends PageObjectt{
    public static final Target CONFIRM_PAGE = Target.the("tells us if we advance to the next step correctly").located(By.xpath("//*[@class='signup-consent__text--highlight']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("where do we confirm the password").located(By.id("confirmPassword"));
    public static final Target TERMSOFUSE = Target.the("where do we accept the terms of use").located(By.xpath("//*[@name='termOfUse']"));
    public static final Target TERMSOFPRIV = Target.the("where do we accept the privacy and security policy").located(By.xpath("//*[@name='privacySetting']"));
    public static final Target COMPLETESETUP_BUTTON = Target.the("button to end the registration").located(By.xpath("//*[@id='laddaBtn']"));

}
