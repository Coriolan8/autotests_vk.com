package com.vk.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Yulia on 21.08.2019.
 */
public class HelperTest {
  WebDriver wd;

  public HelperTest(WebDriver wd) {
    this.wd = wd;
  }


  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }
}
