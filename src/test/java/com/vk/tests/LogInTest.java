package com.vk.tests;

import org.testng.annotations.Test;

/**
 * Created by Yulia on 21.08.2019.
 */
public class LogInTest extends TestBase{

  @Test
  public void testLogIn() {
    app.getUserHelper().login("email", "pass");
    app.getNavigationHelper().checkUrlSite("feed");
    app.getUserHelper().logout();
  }
}


