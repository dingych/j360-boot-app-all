package me.j360.disboot.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 说明：小程序服务端启动入口
 */

@SpringBootApplication
public class BootstrapApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(BootstrapApplication.class, args);
    }
}
