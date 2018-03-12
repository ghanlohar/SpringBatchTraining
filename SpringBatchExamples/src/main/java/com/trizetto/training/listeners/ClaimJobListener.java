package com.trizetto.training.listeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class ClaimJobListener implements JobExecutionListener{

	public void afterJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Job:......."+ arg0);
	}

	public void beforeJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Job:......"+ arg0);
	}

}
