package seata.fix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jiangqiang
 * @date 2021/9/29 9:23
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("seata.fix.mapper")
public class SeataBugFixApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataBugFixApplication.class, args);
    }
}
