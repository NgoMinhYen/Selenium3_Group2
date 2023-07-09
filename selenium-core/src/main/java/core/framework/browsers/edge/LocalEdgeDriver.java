package core.framework.browsers.edge;

import core.framework.browsers.IWebDriver;
import core.framework.commons.Constant;
import core.framework.driver.DriverProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class LocalEdgeDriver implements IWebDriver {
    /**
     * Create local edge driver
     *
     * @param property:DriverProperty
     * @return WebDriver
     */
    @Override
    public WebDriver createWebDriver(DriverProperty property) {
        try {
            //System.setProperty(Constant.EDGE_WEBDRIVER_PROPERTY, property.getDriverPath());
            WebDriverManager.edgedriver().setup();

            EdgeOptions options = new EdgeOptions();
            options.addArguments(property.getArguments());
            options.setHeadless(property.isHeadless());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(EdgeOptions.CAPABILITY, options);
            options.merge(capabilities);

            return new EdgeDriver(options);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
