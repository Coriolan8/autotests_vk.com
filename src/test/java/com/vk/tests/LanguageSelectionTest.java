package com.vk.tests;

import org.testng.annotations.Test;

/**
 * Created by Yulia on 22.08.2019.
 */
public class LanguageSelectionTest extends TestBase {

  @Test
  public void testLanguages() {
    app.getUserHelper().choiceLang("Русский");
    app.getNavigationHelper().checkTitelPage("Добро пожаловать");
    app.getUserHelper().inEnglish();
    app.getNavigationHelper().goToLanguagesPage();
    app.getUserHelper().choiceLang("Удмурт");
    app.getNavigationHelper().checkTitelPage("Гажаса ӧтиськом");
    app.getUserHelper().inEnglish();
  }
}
