package com.kbw0226.managerpg;

import com.kbw0226.managerpg.global.repository.CustomMongoRespositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(

        repositoryBaseClass = CustomMongoRespositoryImpl.class
)
public class ManageRpgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageRpgApplication.class, args);
    }

}
