package com.peri.cc_car.web;

import com.peri.cc_car.dto.CarDTO;
import com.peri.cc_car.services.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGQLController {
    private CarService carService;

    public CarGQLController(CarService carService) {
        this.carService = carService;
    }

    @QueryMapping
    public List<CarDTO> getCars() {
        return carService.getCars();
    }

    @QueryMapping
    public List<CarDTO> getCarsByModel(@Argument String model) {
        return carService.getCarByModel(model);
    }

    @MutationMapping
    public CarDTO saveCar(@Argument("car") CarDTO car) {
        return carService.saveCar(car);
    }
}
