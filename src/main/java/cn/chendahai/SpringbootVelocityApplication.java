package cn.chendahai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//exclude = ErrorMvcAutoConfiguration.class
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@Controller
public class SpringbootVelocityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootVelocityApplication.class, args);
    }

    /**
     * 自定义404页面访问异常
     * 需要exclude = ErrorMvcAutoConfiguration.class
     * 否则会自动访问/error,跳转到BasicErrorController
     */
    @RequestMapping("/**")
    public String notFound() {
        return "404";
    }
}
