package tests;
import utility.Constant;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import pageObjects.Support;

public class HomePage extends Support {
    
    
 
    
  @Test
  public void verifyHomepage() {
	  
	 //Verifying Page title 
	  String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, Constant.expectedTitle);
  }
   
  @Test 
  public void verifyStatistics() {
     //Verifying Statistics/ High-Level/Summations section text present
     
     String actualText = getTextByxpath(Constant.stat);
     
     System.out.println(actualText);
     Assert.assertEquals(actualText, "Statistics");
     
  }
     //Verifying More Info button present for future use
     

  @Test
  	public void verifyAddRecord() {
     //Verifying Export and Add record buttons are disabled under control section
     String actualButtonText = getTextByxpath(Constant.addRecord);
     
     System.out.println(actualButtonText);
     Assert.assertEquals(actualButtonText, "ADD RECORD");
  }
     //check add record is disabled
     @Test
     
   	public void verifybuttonDisabled(){
    	 
     boolean bAddRecord = verifyByxpath(Constant.addRecord);
     System.out.println(bAddRecord);
     Assert.assertEquals(bAddRecord,true);
  }
     
     @Test
     
    	public void verifyeditIcon(){
     	 
     //Verifying edit icon is present for any of the status,Project Owner or budget field
     boolean bEditIcon = verifyByxpath(Constant.editIcon);
     System.out.println(bEditIcon);
     Assert.assertEquals(bEditIcon,true);
     
  
     driver.close();
  }
  
  
  @AfterMethod
  public void appendFinalHTMLReport(ITestResult result){
      if(result.getStatus() == ITestResult.FAILURE)
      {
         driver.quit();
      }
   }
  //non @test methods 
  
  
	  
  
  
}