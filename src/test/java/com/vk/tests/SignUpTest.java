package com.vk.tests;
import org.testng.annotations.Test;

/**
 * Created by Yulia on 21.08.2019.
 */
public class SignUpTest extends TestBase{


  @Test
  public void testSignUp() {
     app.getUserHelper().createNewUser();
     app.getNavigationHelper().checkUrlSite("https://vk.com/join?act=finish");
  }
}
