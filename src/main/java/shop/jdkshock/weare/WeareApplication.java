package shop.jdkshock.weare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeareApplication {

    public static void main(String[] args) {
        System.out.println("merge 테스트 프로젝트에서 운영의 소스 변경한 상황");
        SpringApplication.run(WeareApplication.class, args);
    }

}
