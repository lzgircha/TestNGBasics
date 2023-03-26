package class04;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result){         //attaching the result of your test case
        System.out.println("The test case has passed "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("The test case has failed "+result.getName());
    }
}
