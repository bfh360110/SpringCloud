package cn.ekgc.addrbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan("cn.ekgc.addrbook.dao")
@EnableEurekaClient
@SpringBootApplication
public class ProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(ProviderStarter.class, args);
	}
}
