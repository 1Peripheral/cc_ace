package com.peri.cc_car;

import com.peri.cc_car.dao.entities.Car;
import com.peri.cc_car.dao.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CcCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcCarApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CarRepository carRepository) {
        return args -> {
            carRepository.saveAll(
                    List.of(
                            Car.builder().model("toyota").color("white").matircule("1234").price(100_000d).build(),
                            Car.builder().model("honda").color("black").matircule("9834h").price(340_000d).build(),
                            Car.builder().model("mitsubishi").color("black").matircule("kdur44").price(130_000d).build(),
                            Car.builder().model("mazda").color("red").matircule("kjdiut").price(280_000d).build()
                    )
            );
        };
    }

}
