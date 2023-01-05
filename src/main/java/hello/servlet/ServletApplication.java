package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan // 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletApplication.class, args);
    }

//    @Bean
//    InternalResourceViewResolver internalResourceViewResolver() {
//        return new InternalResourceViewResolver("/WEB-INF/veiws/",".jsp");
//    }
    // application.properties 에 등록해주면 안해도 된다. 스프링부트 짱!
}
