package com.spring.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableCaching
@EnableRedisHttpSession
@SpringBootApplication
public class SessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionApplication.class, args);
    }

}
