package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {

//    @Bean //if you write like this you do not have to write @Component in Doctor class
//    public Doctor doctor(){
//        return new Doctor();
//    }
}
