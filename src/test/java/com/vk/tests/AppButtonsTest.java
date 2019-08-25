package com.vk.tests;

import org.testng.annotations.Test;

/**
 * Created by Yulia on 22.08.2019.
 */
public class AppButtonsTest extends TestBase {


  @Test
  public void testAndroidApp() {
    app.getNavigationHelper().goToPage("https://play.google.com/store/apps/details?id=com.vkontakte.android");
    app.getNavigationHelper().checkTitelPage("Приложения в Google Play" + "ВКонтакте");

  }

  @Test
  public void testIphoneApp() {
    app.getNavigationHelper().goToPage("https://apps.apple.com/app/id564177498");
    app.getNavigationHelper().checkTitelPage("VK — social network on the App");
  }

  @Test
  public void testAllProductsButton() {
    app.getNavigationHelper().goToPage("https://vk.com/products");
    app.getNavigationHelper().checkTitelPage("Products");
  }


}
