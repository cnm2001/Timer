package com.ess.timer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@Configuration

public class TimerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimerApplication.class, args);


    }


}
