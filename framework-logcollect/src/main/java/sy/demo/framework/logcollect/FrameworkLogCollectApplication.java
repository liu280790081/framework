package sy.demo.framework.logcollect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by dell on 2019/1/26.
 * @author dell
 */
@SpringBootApplication(scanBasePackages = {"sy.demo.framework"})
@EnableFeignClients(basePackages = {"sy.demo.framework.logcollect.client"})
public class FrameworkLogCollectApplication {
    public static void main(String[] args){
        SpringApplication.run(FrameworkLogCollectApplication.class,args);
    }
}
