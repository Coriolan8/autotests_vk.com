package com.vk.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Yulia on 21.08.2019.
 */
public class UserHelper extends HelperTest{

  public UserHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String username, String pass) {
    type(By.id("index_email"), username);
    type(By.id("index_pass"), pass);
    click(By.id("index_login_button"));  }



  public void logout() {
    click(By.id("top_profile_link"));
    click(By.id("top_logout_link"));
  }

  public void createNewUser() {
    type(By.id("ij_first_name"), "Name");
    type(By.id("ij_last_name"), "LastName");
    click(By.id("dropdown1"));
    click(By.id("option_list_options_container_1_30"));
    click(By.id("dropdown2"));
    click(By.id("option_list_options_container_2_6"));
    click(By.id("dropdown3"));
    click(By.id("option_list_options_container_3_11"));
    click(By.xpath("//div[@onclick=\"radiobtn(this, 1, 'ij_sex');\"]"));
    click(By.id("ij_submit"));
//    choiceValue(By.id("container4"), "4");
//    click(By.id("ij_submit"));
//    type(By.id("join_phone"), "9032599597");

  }
  public void inEnglish() {
    String title = wd.getTitle();
    if (!title.equals("Welcome! | VK")){
      wd.findElement(By.id("top_switch_lang")).click();
    }
  }

  public void typeInquiry(String text) {
    type(By.id("ts_input"), text);
  }

  public void choiceLang(String lang) {
    click(By.linkText(lang));
  }

  public void loginFacebook(String username, String pass) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();    }
    String parentHandle = wd.getWindowHandle();
    click(By.xpath("//div[@class='fb-login-button index_fb_continue_with_btn fb_iframe_widget']"));
    for (String winHandle : wd.getWindowHandles()) {
      wd.switchTo().window(winHandle);}
    type(By.name("email"),username);
    type(By.name("pass"), pass);
    click(By.name("login"));
    wd.switchTo().window(parentHandle);}


  }

