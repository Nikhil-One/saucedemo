package StepDefinationFile;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class sample1 {

	@BeforeStep
	public void abc() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Before step Hooks Annotations");
	}

	@AfterStep
	public void xyz() throws InterruptedException
	{
		Thread.sleep(2000);
		
		System.out.println("After step Hooks Annotations");
		System.err.println("---------------------------");
	}
}

