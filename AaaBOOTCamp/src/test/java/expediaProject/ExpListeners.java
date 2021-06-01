package expediaProject;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ExpListeners implements ITestListener {
	
	
WebDriver driver;

@Override
public void onStart(ITestContext context) {
	System.out.println("Test Started");
}
@Override
public void onTestSuccess(ITestResult result) {
	String Path=System.getProperty("user.dir");
	Date dt=new Date();
	String sw=dt.toString().replace(" ", "_").replace(":", "_");
	this.driver = ((Usabiltyex)result.getInstance()).driver;
	File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(ds, new File(Path+"\\PicturesEXP\\PassedEXP\\"+sw+"Pictures.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public void onTestFailure(ITestResult result) {
	String Path=System.getProperty("user.dir");
	Date dt=new Date();
	String sw=dt.toString().replace(" ", "_").replace(":", "_");
	this.driver = ((Usabiltyex)result.getInstance()).driver;
	File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(ds, new File(Path+"\\PicturesEXP\\FailedEXP\\"+sw+"Pictures.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public void onFinish(ITestContext context) {
	System.out.println("Test Finished");
}

}
