package chenxr.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 重新做人idea基础学习
 * @date 2020-8-05
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        //not SpringBoot Application!!!!
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
