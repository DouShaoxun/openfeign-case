package cn.cruder.dousx.consumer;

import cn.cruder.logutil.annotation.EnableAopLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dousx
 * @date 2022-07-02 17:35
 */
@EnableAopLog
@SpringBootApplication
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
