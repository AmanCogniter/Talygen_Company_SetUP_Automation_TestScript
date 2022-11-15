package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.CRMRoleTitleAction;
import Action.LoginAction;
import Action.ReviewTemplateAction;
import utils.WebTestBase;

public class CRMRoleTitle extends WebTestBase {
static String Screenname = "<b>CRMRoleTitle</b>";
	
	
	
	@Test(priority = 1)
	public void validationCheck()
	{
	test=getTest( Screenname + " : Validation message on Add CRM Role Title screen");
	CRMRoleTitleAction cRMRoleTitleAction = new CRMRoleTitleAction (driver);
	new LoginAction(driver).logoutLogin();
	cRMRoleTitleAction.goToCRMRoleTitleTab();
	cRMRoleTitleAction.ValidationCheck();

	}
	@Test(priority = 2)
	public void addCRMRoleTitlePage()
	{
		test = getTest( Screenname + ":  Add CRM Role Title Page");
		CRMRoleTitleAction cRMRoleTitleAction=  new CRMRoleTitleAction(driver);
		new LoginAction(driver).logoutLogin();
		
		cRMRoleTitleAction.goToCRMRoleTitleTab();
		cRMRoleTitleAction.addCRMRoleTitlePage();
		
	}
	
	  @Test(priority = 3) 
	  public void editCRMRoleTitlePage() 
	  { 
		 test = getTest(Screenname + ":  Search CRM Role Title Page"); 
		 CRMRoleTitleAction cRMRoleTitleAction= new CRMRoleTitleAction(driver); 
		 new LoginAction(driver).logoutLogin();
	  
		 cRMRoleTitleAction.goToCRMRoleTitleTab();
		 cRMRoleTitleAction.editCRMRoleTitlePage();
	  
	  
	  }
	  @Test(priority = 4)
	  public void CRMRoleTitleStatusModificationAndValidation()
	  {
		  test = getTest(Screenname + ":  CRM Role Title Status Modification and Validation"); 
		  CRMRoleTitleAction cRMRoleTitleAction= new CRMRoleTitleAction(driver); 
			 new LoginAction(driver).logoutLogin();
		  
			 cRMRoleTitleAction.goToCRMRoleTitleTab();
			 cRMRoleTitleAction.ActiveStatus();
			 cRMRoleTitleAction.InactiveStatus();
			 cRMRoleTitleAction.delete();
			
		  
		  
	  }
	 
}
