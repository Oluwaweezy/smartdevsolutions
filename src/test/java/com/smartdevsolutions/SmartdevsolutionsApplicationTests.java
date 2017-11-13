package com.smartdevsolutions;

import com.smartdevsolutions.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmartdevsolutionsApplicationTests {

/*	@Test
	public void contextLoads() {
	}*/


	 @Autowired
	private I18NService i18NService;

	@Test
	 public void testMessageByLocaleService() throws  Exception
	{
      String expectedResult = "Bootstrap starter template";
      String messageID = "index.main.callout";
      String actual = i18NService.getMessage(messageID);
		Assert.assertEquals("The actual Expected String Don't match", expectedResult,actual);
	}

}
