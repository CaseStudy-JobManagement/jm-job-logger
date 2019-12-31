package com.optile.cs.job;

import com.optile.cs.client.Job;
import org.springframework.stereotype.Component;

@Component
public class LoggingJob extends Job {

    @Override
    protected void process(String jobId) {
        this.log(jobId, "Hello Job");
    }
}
