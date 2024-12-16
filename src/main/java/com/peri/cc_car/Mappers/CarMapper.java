package com.peri.cc_car.Mappers;

import com.peri.cc_car.dao.entities.Car;
import com.peri.cc_car.dto.CarDTO;
import org.modelmapper.ModelMapper;

public class CarMapper {
    public CarDTO fromCar(Car car) {
        return CarDTO.builder()
                .model(car.getModel())
                .color(car.getColor())
                .matircule(car.getMatircule())
                .price(car.getPrice())
                .build();
    }

    public Car fromCarDTO(CarDTO car) {
        return Car.builder()
                .model(car.getModel())
                .color(car.getColor())
                .matircule(car.getMatircule())
                .price(car.getPrice())
                .build();
    }
}
