package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import model.Timout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class CreateTask {
    BaseTests baseTests = new BaseTests();
    WebDriver driver = baseTests.setUp();
    Timout timeout = new Timout();
    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);


    @BeforeClass
    public void setUp () throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(homePage.homePageUrl());
        
        //signin with facebook
//        commonMethods.clickOnButton(Locators.fbLoginBtn);
//        timeout.timeout();
//        commonMethods.setText(Locators.emailField, Locators.email);
//        timeout.timeout();
//        commonMethods.setText(Locators.passField, Locators.pass);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.loginBtn);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.continueBtn);
//        timeout.timeout();
//        Thread.sleep(2000);
        
        //signin with google
//        commonMethods.clickOnButton(Locators.googleBtn);
//        timeout.timeout();
//        commonMethods.setText(Locators.emailField, Locators.emailId);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.emailBtn);
//        timeout.timeout();
//        Thread.sleep(2000);
//        //commonMethods.setText(Locators.fullName, Locators.fullNameText);
//        //timeout.timeout();
//        commonMethods.setText(Locators.passField, Locators.pass);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.submitBtn);
//        timeout.timeout();
        
        
        //continue with email
       commonMethods.clickOnButton(Locators.continueEmailBtn);
      timeout.timeout();
      commonMethods.setText(Locators.emailField, Locators.emailId);
      timeout.timeout();
      commonMethods.clickOnButton(Locators.emailBtn);
      timeout.timeout();
      Thread.sleep(2000);
//      commonMethods.setText(Locators.fullName, Locators.fullNameText);
//      timeout.timeout();
//      Thread.sleep(2000);
      commonMethods.setText(Locators.passField, Locators.pass);
      timeout.timeout();
      commonMethods.clickOnButton(Locators.submitBtn);
      timeout.timeout();
      Thread.sleep(5000);
    }
    
//    @Test(priority = 1)
//    public void signIn () throws InterruptedException {
//    	commonMethods.clickOnButton(Locators.continueEmailBtn);
//        timeout.timeout();
//        commonMethods.setText(Locators.emailField, Locators.emailId);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.emailBtn);
//        timeout.timeout();
//        Thread.sleep(2000);
//        commonMethods.setText(Locators.fullName, Locators.fullNameText);
//        timeout.timeout();
//        Thread.sleep(2000);
//        commonMethods.setText(Locators.passField, Locators.pass);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.submitBtn);
//        timeout.timeout();
//    }
    
    @Test(priority = 1)
    public void myDailyTask() throws InterruptedException{
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.createBtn);
    	timeout.timeout();
    	commonMethods.setText(Locators.wantTo, Locators.wantToText);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.addTaskBtn);
    	String createTask = commonMethods.getText(Locators.myDailyTask);
        assertEquals(createTask, Locators.myDailyTaskText);
        System.out.println("Successfully Task created and displayed on home page");
    }
    
    @Test(priority = 2)
    public void myFridayTask() throws InterruptedException{
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.createBtn);
    	timeout.timeout();
    	commonMethods.setText(Locators.wantTo, Locators.FridayText);
    	timeout.timeout();
    	commonMethods.setText(Locators.fridayInsertNote, Locators.fridayInsertText);
    	timeout.timeout();
    	Thread.sleep(2000);
    	commonMethods.clickOnButton(Locators.nextWeekBtn);
    	timeout.timeout();
    	Thread.sleep(2000);
    	commonMethods.clickOnButton(Locators.addTaskBtn);
    	timeout.timeout();
        String myFridayTask = commonMethods.getText(Locators.myFridayTask);
        assertEquals(myFridayTask, Locators.FridayText);
        System.out.println("Successfully Task created and displayed on home page");
    }
    
    @Test(priority = 3)
    public void subTask() throws InterruptedException{
    	Thread.sleep(4000);
    	commonMethods.clickOnButton(Locators.subTaskBtn);
    	timeout.timeout();
    	commonMethods.setTextWithClick(Locators.subTaskItemBtn, Locators.subTaskItemText);
    	timeout.timeout();
    	//commonMethods.clickOnButton(Locators.justClick);
    	//timeout.timeout();
    	Thread.sleep(2000);
        System.out.println("Successfully sub task created");
    }
    @Test(priority = 4)
    public void list() throws InterruptedException{
    	Thread.sleep(4000);
    	driver.navigate().back();
    	commonMethods.clickOnButton(Locators.listIcon);
    	timeout.timeout();
    	Thread.sleep(2000);
    	commonMethods.setTextWithClick(Locators.nameList, Locators.listText);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.listBtn);
    	timeout.timeout();
        System.out.println("Successfully New list appended on list category");
    }
    
    @Test(priority = 5)
    public void shoppingList() throws InterruptedException{
    	Thread.sleep(4000);
    	commonMethods.clickOnButton(Locators.shoppingListBtn);
    	timeout.timeout();
    	Thread.sleep(2000);
    	commonMethods.setTextWithClick(Locators.shoppingListTextField, Locators.shoppingText1);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.enterBtn);
    	timeout.timeout();
    	commonMethods.setTextWithClick(Locators.shoppingListTextField, Locators.shoppingText2);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.enterBtn);
    	timeout.timeout();
    	commonMethods.setTextWithClick(Locators.shoppingListTextField, Locators.shoppingText3);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.enterBtn);
    	timeout.timeout();
    	commonMethods.setTextWithClick(Locators.shoppingListTextField, Locators.shoppingText4);
    	timeout.timeout();
    	commonMethods.clickOnButton(Locators.enterBtn);
    	timeout.timeout();
        System.out.println("Successfully all the items appended on the list");
    }

    @AfterClass
    public void tearDown() {
        timeout.timeout();
        //driver.quit();
    }
}

