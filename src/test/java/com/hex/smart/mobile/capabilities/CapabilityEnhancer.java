package com.hex.smart.mobile.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;

public class CapabilityEnhancer implements BeforeAWebdriverScenario {

	@Override
	public DesiredCapabilities apply(EnvironmentVariables environmentVariables, SupportedWebDriver driver,
			TestOutcome testOutcome, DesiredCapabilities capabilities) {
		capabilities.setCapability("appium.chromeOptions", ImmutableMap.of("w3c",false));
		
		return null;
	}

	
}
