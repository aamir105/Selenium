package APPIUM;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
public class Calculator {
    public static void main(String[] args) {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapability.AUTOMATION_NAME);
    }
}
