package mytest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Import(User.class)  //方法1
@Configuration   //方法2
@ComponentScan
public class Config {

//    @Bean
//    public User user(){
//        return new User();
//    }

}
