package kr.co.sboard.sboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AppInfo appInfo(){
        return new AppInfo();
    }

}
