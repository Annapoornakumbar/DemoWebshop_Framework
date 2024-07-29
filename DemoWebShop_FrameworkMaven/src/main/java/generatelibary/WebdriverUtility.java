package generatelibary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class WebdriverUtility {
	public void captureScrenshot(WebDriver driver,String name) {
		
		String modName = name+ " "+JavaUtility.getTimeStamp();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshots/"+modName+".png");
        try {
			FileHandler.copy(src, trg)		;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

