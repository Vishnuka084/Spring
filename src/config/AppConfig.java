package config;

import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Spring Bean definitions walata source ekak
//How to scan POJO  and enter to the Application context
@Configuration
@ComponentScan(basePackages = "config")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig");
    }

    //when we are not allowed to put the @Component annotation we can use this method to
    //introduce a spring bean to the Application Context
    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }


}
