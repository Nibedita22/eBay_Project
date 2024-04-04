import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.BaseClassFinder;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }



    // to take the screenshot of a failed test cases
    @Override
    public void onTestFailure(ITestResult result) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/HH-mm-ss");
        Date date = new Date();
        String name = dateFormat.format(date);

        // to take the screenshot of a failed test cases
        File file = ((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.FILE);


        try {
            // to save the screenshot of a failed test cases

            FileUtils.copyFile(file, new File("src/screen/" + name + ".png" ));

        } catch (IOException e){
           throw new RuntimeException(e);
        }

    }


}
