package com.jiapengcs.vcc.bsp.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/14
 */
@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class VccBspTraceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VccBspTraceApplication.class, args);
    }
}
