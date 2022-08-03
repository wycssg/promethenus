package com.example;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 代码自动生成
 *
 * @author heluo
 * 2022/6/29 10:40
 */
public class GeneratorSQL {
    public static void main(String[] args) {
        new StrategyConfig.Builder()
                .serviceBuilder()
                .formatServiceFileName("%sService")
                .formatServiceImplFileName("%sServiceImp")
                .build();
        FastAutoGenerator.create("jdbc:mysql://114.215.178.51:3306/nuoke?useUnicode=true&characterEncoding=utf8&useSSL=false",
                "wyc","nuoke123456")
                .globalConfig(builder -> {
                    builder.author("wyc")
                            .fileOverride()
                            .outputDir("D:\\workSpace\\GenertorDemo\\src\\main\\java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.generator") // 设置父包名
                            .moduleName("base") // 设置父包模块名
                            .entity("entity")//设置entity包名
                            .other("dto")// 设置dto包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\workSpace\\GenertorDemo\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .templateConfig(builder -> {
                    builder.entity("/templates/entityDTO.java")
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .xml("/templates/mapper.xml")
                            .controller("/templates/controller.java");
                })
                .injectionConfig(consumer ->{
                    Map<String, Object> customMap = new HashMap<>();
                    customMap.put("springdoc",false);
                    customMap.put("restControllerStyle", true);

                    consumer.customMap(customMap);
                })
                .strategyConfig(builder -> {
                    builder.addInclude("tbase_company")// 设置需要生成的表名
                            .serviceBuilder();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
