package com.vk.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yulia on 21.08.2019.
 */
public class ApplicationManager {
  WebDriver wd;

  private  NavigationHelper navigationHelper;
  private  UserHelper userHelper;


  public void init(BrowserType browserType) {
    switch (browserType) {
      case FIREFOX:
        wd = new FirefoxDriver();
        break;
      case CHROME:
        wd = new ChromeDriver();
        break;
      default:
        wd = new ChromeDriver();
        break;
    }
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    userHelper = new UserHelper(wd);
    navigationHelper = new NavigationHelper(wd);

  }

  public void stop() {
    wd.quit();
  }

  public UserHelper getUserHelper() {
    return userHelper;
  }
  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
