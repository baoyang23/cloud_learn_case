package com.yang.cloud.weather.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Mu_Yi
 * @Date: 2019/11/25 23:08
 * @Version 1.0
 * @qq: 1411091515
 */

@Slf4j
@Configuration
public class QuartzConfiguration {

    /**
     * 更新频率
     */
    private final int TIME = 1800;

    @Bean
    public JobDetail weatherDataSyncDetail(){
        return JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("weatherDataSyncJob").storeDurably().build();
    }

    @Bean
    public Trigger sampleJobTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(TIME).repeatForever();
        return TriggerBuilder.newTrigger().forJob(weatherDataSyncDetail()).withIdentity("weatherDataSyncTrigger").withSchedule(scheduleBuilder).build();
    }

}
