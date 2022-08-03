package com.batch.processor;

import com.example.generator.base.entity.TbaseCompany;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 15:34
 */
@Component
public class ValidatingItemProcessorDemo {
    @Resource
    private JobBuilderFactory jobBuilderFactory;
    @Resource
    private StepBuilderFactory stepBuilderFactory;
    @Resource
    private ListItemReader<TbaseCompany> simpleReader;

    @Bean
    public Job validatingItemProcessorJob() {
        return jobBuilderFactory.get("validatingItemProcessorJob")
                .start(step())
                .build();
    }

    private Step step() {
        return stepBuilderFactory.get("step")
                .<TbaseCompany, TbaseCompany>chunk(2)
                .reader(simpleReader)
                .processor(validatingItemProcessor())
                .writer(list -> list.forEach(System.out::println))
                .build();
    }

    private ValidatingItemProcessor<TbaseCompany> validatingItemProcessor() {
        ValidatingItemProcessor<TbaseCompany> processor = new ValidatingItemProcessor<>();
        processor.setValidator(value -> {
            // 对每一条数据进行校验
            if ("".equals(value.getCompanyCode())) {
                // 如果field3的值为空串，则抛异常
                throw new ValidationException("field3的值不合法");
            }
        });
        return processor;
    }
}
