package com.rookout.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@PropertySource(value = "classpath:application.properties")
@ComponentScan(value = {"com.rookout.test"})
@EnableScheduling
public class AppConfig {

}
