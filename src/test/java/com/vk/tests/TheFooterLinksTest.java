package com.vk.tests;

import org.testng.annotations.Test;

/**
 * Created by Yulia on 22.08.2019.
 */
public class TheFooterLinksTest extends TestBase {

  @Test
  public void testTheVkLink() {
    app.getNavigationHelper().goToPage( "https://vk.com/about");
    app.getNavigationHelper().checkTitelPage("Company Info | VK");}
  @Test
  public void testTheAboutLink() {
    app.getNavigationHelper().goToPage("https://vk.com/about");
    app.getNavigationHelper().checkTitelPage("Company Info | VK");}
  @Test
  public void testTheTermsLink() {
    app.getNavigationHelper().goToPage("https://vk.com/terms");
    app.getNavigationHelper().checkTitelPage("Terms of Service | VK");}

    @Test
  public void testTheDevelopersLink() {
    app.getNavigationHelper().goToPage("https://vk.com/dev");
    app.getNavigationHelper().checkTitelPage("Developers | VK");}
}
