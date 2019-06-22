package sombrero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    SombreroProperties sombreroProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=====================");
        System.out.println(hello);
        System.out.println(sombreroProperties.getName());
        System.out.println(sombreroProperties.getFullName());
        System.out.println("=====================");
    }
}
