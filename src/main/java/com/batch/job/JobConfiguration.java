package com.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/26 11:30
 */
@Configuration
public class JobConfiguration {
    // 注入创建任务的对象
    @Resource
    private JobBuilderFactory jobBuilderFactory;

    // 注入创建步骤的对象
    @Resource
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job helloworldJob() {
        return jobBuilderFactory.get("helloworldJob")
                .start(step1())
                .next(step2())
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .tasklet(new Tasklet() {
                    @Override
                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
                        System.out.println(Thread.currentThread().getName() + "------" + "step1");
                        // 返回执行完成状态
                        return RepeatStatus.FINISHED;
                    }
                })
                .build();
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory.get("step2").tasklet((stepContribution, chunkContext)->{
            System.out.println(Thread.currentThread().getName() + "------" + "step2");
            return RepeatStatus.FINISHED;
        }).build();
    }

}
