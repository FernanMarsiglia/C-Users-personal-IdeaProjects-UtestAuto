package co.com.choucair.certification.UtestAuto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestLoginPage extends PageObject {
    public static final Target INPUT_USERFIRSTNAME = Target.the("where do we write the user first name").located(By.id("firstName"));
    public static final Target INPUT_USERLASTNAME = Target.the("where do we write the user last name").located(By.id("lastName"));
    public static final Target INPUT_EMAILADDRESS = Target.the("where do we write the user email address").located(By.id("email"));
    public static final Target SELECT_MONTHBIRTH = Target.the("where do we choose the user month of birth").located(By.xpath("//*[@name='birthMonth']//descendant::option[11]"));
    public static final Target SELECT_DAYBIRTH = Target.the("where do we choose the user day of birth").located(By.xpath("//*[@name='birthDay']//descendant::option[32]"));
    public static final Target SELECT_YEARBIRTH= Target.the("where do we choose the user year of birth").located(By.xpath("//*[@name='birthYear']//descendant::option[10]"));
    public static final Target NEXT_BUTTON = Target.the("button that indicates the next step of the sign up").located(By.xpath("//a[@class='btn btn-blue']");
}
