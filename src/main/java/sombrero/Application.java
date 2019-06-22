package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * @Profile
     * 어떤 특정한 프로파일에서만 어떤 특정한 빈을 등록하고 싶다거나
     * 특정 프로파일에서 빈 설정을 다르게 하고 싶을 때 사용.
     *
     * $ java -jar target/spring-boot-app-03-1.0-SNAPSHOT.jar --spring.profile.active=test
     * 프로퍼티즈에 설정된 것보다 위의 명령으로 실행한 옵션의 우선순위가 높음.
     *
     * application.properties 보다
     * 프로파일 관련 프로퍼티즈 파일 (application-프로파일명.properties)의 우선순위가 높음.
     */


}
