package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.EmailTemplateAction;
import Action.LoginAction;
import Action.TemplateMappingAction;
import Action.TrainingFeedbackAction;
import utils.WebTestBase;

public class TemplateMapping  extends WebTestBase {
	
	
	static String Screenname = "<b>TemplateMapping </b>";
	@Test(priority=1)
	public void addTemplateMappingValidation()
	{
		
		test = getTest( Screenname + ":  Validation check and Userguide Check and cancel button");
		TemplateMappingAction templateaction = new TemplateMappingAction(driver);
		new LoginAction(driver).logoutLogin();
		templateaction.goToTemplateMappingTab();
		templateaction.validationCheck();	
	}
//	@Test(priority=2)
//	public void CreateEmailTemplate() {
//		test = getTest( Screenname + ": Create Email Template");
//		Emailtemplate emailtemplate= new Emailtemplate();
//		new LoginAction(driver).logoutLogin();
//		emailtemplate.addEmailTemplate();
//
//		
//	}
	
	@Test(priority=2)
	public void addTemplateMapping()
	{
		
	     test = getTest( Screenname + ": Add Template Mapping");
		
		TemplateMappingAction templateaction = new TemplateMappingAction(driver);
		EmailTemplateAction emailtemplateaction = new EmailTemplateAction (driver);
		new LoginAction(driver).logoutLogin();
		emailtemplateaction.moveToEmailTemplateTab();
		emailtemplateaction.AddEmailMappingTemplate();	
		templateaction.goToTemplateMappingTab();
		templateaction.addTemplateMapping();	
	}
	
	
	@Test(priority=3)
	 public void TrainingFeedbacklisting()
	 {
		
		test = getTest( Screenname + ": Template Mapping listing");
		TemplateMappingAction templateaction = new TemplateMappingAction(driver);
		new LoginAction(driver).logoutLogin();
		templateaction.goToTemplateMappingTab();
		templateaction.ActiveStatus();
		templateaction.InactiveStatus();
		templateaction.delete();
		
	 }
	

}
