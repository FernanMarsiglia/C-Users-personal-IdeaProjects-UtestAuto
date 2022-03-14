package co.com.choucair.certification.UtestAuto.userinterface;

import net.serenitybdd.core.pages.PageObject;

public class FillsFormPage extends PageObject{
    public static final Target INPUT_USERCITY = Target.the("where do we write the city where the user lives").located(By.xpath("//input[@name='city']"));
    public static final Target INPUT_USERPOSTALCODE = Target.the("where do we write the postal code where the user lives").located(By.xpath("//input[@name='zip']"));
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country").located(By.xpath("//*[@type='search']"));
    public static final Target NEXT_BUTTON2 = Target.the("button that indicates the next step of the sign up").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target CONFIRM_NEXTSTEP = Target.the("tells us if we advance to the next step correctly").located(By.xpath("//*[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']"));
    public static final Target INPUT_USERPCOS = Target.the("where do we write the user OS").located(By.xpath("//*[@name='osId']"));
    public static final Target INPUT_USERPCOSVERSION = Target.the("where do we write the user PC OS version").located(By.xpath("//*[@name='osVersionId']"));
    public static final Target INPUT_USERPCOSlANGUAGE = Target.the("where do we write the user PC OS language").located(By.xpath("//*[@name='osLanguageId']"));
    public static final Target INPUT_USERMOBDEV = Target.the("where do we write the user mobile device").located(By.xpath("//*[@name='handsetMakerId']"));
    public static final Target INPUT_USERMOBDEVMODEL = Target.the("where do we write the user mobile device model").located(By.xpath("//*[@name='handsetModelId']"));
    public static final Target INPUT_USERMOBDEVOS = Target.the("where do we write the user mobile device OS").located(By.xpath("//*[@name='handsetOSId']"));
    public static final Target NEXT_BUTTON3 = Target.the("button that indicates the last step of the sign up").located(By.xpath("//*[@class='btn btn-blue pull-right']"));

}
