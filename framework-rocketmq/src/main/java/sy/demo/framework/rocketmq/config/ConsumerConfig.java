package sy.demo.framework.rocketmq.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dell on 2019/1/4.
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "rocketmq.consumer")
@Configuration
@ToString
public class ConsumerConfig {
    private String groupName;

    private String namesrvAddr;
}
