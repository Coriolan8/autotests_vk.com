package com.vk.tests;

import com.vk.appmanager.ApplicationManager;
import com.vk.appmanager.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Yulia on 21.08.2019.
 */
public class TestBase {


  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init(BrowserType.FIREFOX);
    app.getNavigationHelper().goToMainPage();
    app.getUserHelper().inEnglish();
  }


  @AfterMethod
  public void tearDown() {
    app.stop();

  }

}