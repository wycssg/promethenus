package com.example.generator.batchjob;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 15:55
 */
@RestController
@RequestMapping("job")
public class JobController {
    @Resource
    private Job job;
    @Resource
    private JobLauncher jobLauncher;

    @GetMapping("launcher/{message}")
    public String launcher(@PathVariable String message) throws Exception {
        JobParameters parameters = new JobParametersBuilder()
                .addString("message", message)
                .toJobParameters();
        // 将参数传递给任务
        jobLauncher.run(job, parameters);
        return "success";
    }
}
