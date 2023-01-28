package ru.rotar.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import ru.rotar.eurekaclient.configyration.ConfigRabbit;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Import(ConfigRabbit.class)
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
