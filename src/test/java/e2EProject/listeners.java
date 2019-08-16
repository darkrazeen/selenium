package e2EProject;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Resources.base;


	public class listeners implements ITestListener  {
		
		private static Logger log = LogManager.getLogger(ValidateTitle.class.getName());
		
		base b=new base();
			public void onFinish(ITestContext arg0) {
				// TODO Auto-generated method stub
				//hey i am done
			}

			public void onStart(ITestContext arg0) {
				// TODO Auto-generated method stub
				//
			}

			public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}

			public void onTestFailure(ITestResult result) {
				// TODO Auto-generated method stub
				//screenshot

				try {
					b.getScreenshot(result.getName());
				} catch (IOException e) {
					log.info("Test Failed and the screen shot was taken");
							
					e.printStackTrace();
				}
			}

			public void onTestSkipped(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}

			public void onTestStart(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}

			public void onTestSuccess(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}

		}
