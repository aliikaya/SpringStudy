package com.alikaya.SpringStudy.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alikaya.SpringStudy.dto.BeanDto;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto(){
        return BeanDto
                .builder()
                    .id(0L).beanName("bean name").branData("bean data")
                .build();
    }
}
