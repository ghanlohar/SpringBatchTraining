package com.trizetto.training.utility;



import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException{ 
		String[] springConfig = {"jobConfig.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		/*Job job = (Job)context.getBean("claimJob");
		*/
		Job job = (Job)context.getBean("pagingclaimJob");
		
		Map<String, JobParameter> parameters = new HashMap<String, JobParameter>();
		parameters.put("id", new JobParameter((long)23));
		
		JobExecution execution = jobLauncher.run(job, new JobParameters(parameters));
		System.out.println("Spring batch claim status: ....." + execution.getStatus());
		

	}
}
