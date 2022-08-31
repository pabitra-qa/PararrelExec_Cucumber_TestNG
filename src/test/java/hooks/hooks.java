package hooks;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    Playwright playwright;
    @Before(order = 0)
    public void launchBrowser() {
        playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
        BrowserContext bx = browser.newContext();
        Page page = bx.newPage();
    }
    @After(order  = 0)
    public void teardown()
    {
        System.out.println("complete...");
        playwright.close();
    }
}
