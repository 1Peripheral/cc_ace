package com.peri.cc_car.services;

import com.peri.cc_car.Mappers.CarMapper;
import com.peri.cc_car.dao.entities.Car;
import com.peri.cc_car.dao.repositories.CarRepository;
import com.peri.cc_car.dto.CarDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {
    private CarRepository carRepo;
    final private CarMapper carMapper = new CarMapper();

    public CarManager(CarRepository carRepository) {
        this.carRepo = carRepository;
    }

    @Override
    public List<CarDTO> getCars() {
        return carRepo.findAll()
                .stream()
                .map(carMapper::fromCar)
                .toList();
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        return carRepo.findCarsByModel(model)
                .stream()
                .map(carMapper::fromCar)
                .toList();
    }

    @Override
    public CarDTO saveCar(CarDTO car) {
        Car newCar = carMapper.fromCarDTO(car);
        carRepo.save(newCar);

        return car;
    }
}
