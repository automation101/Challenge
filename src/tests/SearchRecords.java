package tests;
import utility.Constant;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import pageObjects.Support;

public class SearchRecords extends Support {
    
    
  @Test
  public void searchRecordByDepartment() {
	  
      click(Constant.search);
      enterText(Constant.search, "Accounting");
      
      //Checking Accounting record via Project Owner name present
      Assert.assertEquals(driver.getPageSource().contains("Richard Henry"), true);
  }
      @Test
      public void searchRecordsByStatus() {
    	  
      
      //clear previous search and use new filter status as Working
      clearField(Constant.search);
      enterText(Constant.search, "Working");
      //verifying Status=Working record is present by checking element present
      if(driver.findElement(By.xpath(Constant.xpath))!= null){
    	  System.out.println("Element is Present");
    	  }
      
      else{
    	  System.out.println("Element is Absent");
    	  }
      
      System.out.println("Pass");
      
      
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