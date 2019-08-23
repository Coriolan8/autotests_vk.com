package com.vk.tests;

import org.testng.annotations.Test;

/**
 * Created by Yulia on 22.08.2019.
 */
public class SearchTest extends TestBase  {

  @Test
  public void testTheSearch() {
    app.getUserHelper().typeInquiry("First");
    app.getNavigationHelper().checkTitelPage("search results");
  }
}
