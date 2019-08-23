package com.vk.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



/**
 * Created by Yulia on 21.08.2019.
 */
public class NavigationHelper extends HelperTest{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void goToMainPage() {
   wd.get("https://vk.com");
  }

  public void checkTitelPage(String text) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();    }
    String title = wd.getTitle();
    Assert.assertTrue(title.contains(text));
  }

  public void goToPage(String link) {
    wd.get(link);
  }
  public void goToLanguagesPage() {
    click(By.linkText("all languages »"));
  }

  public void checkUrlSite(String text) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();    }
    String url = wd.getCurrentUrl();
    Assert.assertTrue(url.contains(text));
  }
}
