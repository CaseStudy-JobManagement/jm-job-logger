package com.optile.cs;

import com.optile.cs.client.Job;
import com.optile.cs.error.JobException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JMJobLoggerApplication implements CommandLineRunner {
	@Autowired
	private Job job;

	public static void main(String[] args) {
		SpringApplication.run(JMJobLoggerApplication.class, args);
	}

	@Override
	public void run(String... args) throws JobException {
		job.execute(args[0]);
	}
}
