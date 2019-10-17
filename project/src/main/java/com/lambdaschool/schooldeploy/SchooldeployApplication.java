package com.lambdaschool.schooldeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SchooldeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchooldeployApplication.class, args);
    }

}
