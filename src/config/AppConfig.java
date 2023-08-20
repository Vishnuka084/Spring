package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    public AppConfig() {
        System.out.println("Spring Bean Created Object");
    }
}
