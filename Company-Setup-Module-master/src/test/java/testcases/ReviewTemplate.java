package testcases;
import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;
import Action.LoginAction;
import Action.ReviewTemplateAction;
import utils.WebTestBase;

public class ReviewTemplate extends WebTestBase {
static String Screenname = "<b>ReviewTemplate</b>";
	
	
	
	@Test(priority = 1)
	public void validationCheck()
	{
	test=getTest( Screenname + " : Validation message on Add Review Template screen");
	ReviewTemplateAction reviewTemplateAction = new ReviewTemplateAction (driver);
	new LoginAction(driver).logoutLogin();
	reviewTemplateAction.goToReviewTemplateTab();
	reviewTemplateAction.ValidationCheck();
	reviewTemplateAction.userGuide();
	}
	@Test(priority = 2)
	public void addReviewTemplate()
	{
		test = getTest( Screenname + ":  Add Review Template");
		ReviewTemplateAction reviewTemplateAction=  new ReviewTemplateAction(driver);
		new LoginAction(driver).logoutLogin();
		
		reviewTemplateAction.goToReviewTemplateTab();
		reviewTemplateAction.addReviewTemplate();
		
	}
	
	  @Test(priority = 3) 
	  public void editReviewTemplate() 
	  { 
		 test = getTest(Screenname + ":  Search Review Template"); 
		 ReviewTemplateAction reviewTemplateAction= new ReviewTemplateAction(driver); 
		 new LoginAction(driver).logoutLogin();
	  
	  reviewTemplateAction.goToReviewTemplateTab();
	  reviewTemplateAction.editReviewTemplate();
	  
	  
	  }
	  @Test(priority = 4)
	  public void ReviewTemplateStatusModificationAndValidation()
	  {
		  test = getTest(Screenname + ":  Review Template Status Modification and Validation"); 
			 ReviewTemplateAction reviewTemplateAction= new ReviewTemplateAction(driver); 
			 new LoginAction(driver).logoutLogin();
		  
		  reviewTemplateAction.goToReviewTemplateTab();
		  reviewTemplateAction.ActiveStatus();
		  reviewTemplateAction.InactiveStatus();
		  reviewTemplateAction.delete();
			
		  
		  
	  }
	 
}
