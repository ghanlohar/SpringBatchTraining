package com.trizetto.training.listeners;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class ClaimStepListener implements StepExecutionListener{

	public ExitStatus afterStep(StepExecution arg0) {
		// TODO Auto-generated method stub
		return ExitStatus.COMPLETED;
	}

	public void beforeStep(StepExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before step:......"+arg0);	
	}

}
