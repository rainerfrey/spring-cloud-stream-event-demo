package de.mrfrey.scse;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringCloudStreamEventApplication {

    @Bean
    public Supplier<String> hello() {
        return () -> "hello";
    }


    public static void main( String[] args ) {
        SpringApplication.run( SpringCloudStreamEventApplication.class, args );
    }

}
