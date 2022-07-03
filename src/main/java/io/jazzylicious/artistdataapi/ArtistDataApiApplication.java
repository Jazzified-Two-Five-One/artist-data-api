package io.jazzylicious.artistdataapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("io.jazzylicious.artistdataapi.model")
public class ArtistDataApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtistDataApiApplication.class, args);
    }

}
