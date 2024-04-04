import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTracking implements ITestListener {

    // two variables
    private static final ExtentReports extent = ExtentManager.createInstance("htmlReport1.html");
    private static ThreadLocal<ExtentTest> methodTest = new ThreadLocal<>();


    //to get the test
    private ExtentTest getTest(ITestResult result){
        return methodTest.get();
    }


    public synchronized void onTestStart(ITestResult result){

        String methodName = result.getMethod().getMethodName();
        ExtentTest test = extent.createTest(methodName);
        methodTest.set(test);

        //String[] groups = result.getMethod().getGroups();
        //Arrays.asList(groups).forEach(x->methodTest.get().assignCategory(x));

    }


    // to take the screenshot of a failed test cases
    @Override
    public synchronized void onTestFailure(ITestResult result){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/HH-mm-ss");
        Date date = new Date();
        String name = dateFormat.format(date);

        // to take the screenshot of a failed test cases
        File file = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);
        try {
            // to save the screenshot of a failed test cases

            FileUtils.copyFile(file, new File("src/screenshot/" + name + ".png"));

        }catch (IOException e){
            throw new RuntimeException(e);
        }

        //for test failure we will throw
        getTest(result).fail(result.getThrowable());
    }

    public synchronized void onFinish(ITestContext context){
        extent.flush();

    }




}
