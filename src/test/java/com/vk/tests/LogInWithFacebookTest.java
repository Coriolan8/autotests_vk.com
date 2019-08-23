package com.vk.tests;

import org.testng.annotations.Test;

/**
 * Created by Yulia on 22.08.2019.
 */
public class LogInWithFacebookTest extends TestBase{

  @Test
  public void testFacebookLogin() {
    app.getUserHelper().loginFacebook("email","pass");
  }


}
