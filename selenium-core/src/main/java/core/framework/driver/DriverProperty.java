package core.framework.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Selenium webdriver properties
 * Load data from file -> convert to properties object
 *

 */
public class DriverProperty {
    private String              mode;
    private String              browser;
    private String              driverPath;
    private List<String>        arguments    = new ArrayList<>();
    private Map<String, String> prefs        = new HashMap<>();
    private Map<String, String> capabilities = new HashMap<>();
    private String              remoteUrl;
    private boolean             headless;
    private boolean             remote;

    public DriverProperty() {
    }

    public String getMode() {
        return mode;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getDriverPath() {
        return driverPath;
    }

    public void setDriverPath(String driverPath) {
        this.driverPath = driverPath;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public Map<String, String> getPrefs() {
        return prefs;
    }

    public void setPrefs(Map<String, String> prefs) {
        this.prefs = prefs;
    }

    public Map<String, String> getCapabilities() {
        return capabilities;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public boolean isHeadless() {
        return headless;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }
}
