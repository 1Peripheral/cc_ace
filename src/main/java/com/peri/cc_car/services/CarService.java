package com.peri.cc_car.services;

import com.peri.cc_car.dto.CarDTO;

import java.util.List;

public interface CarService {
    public List<CarDTO> getCars();
    public List<CarDTO> getCarByModel(String model);
    public CarDTO saveCar(CarDTO car);
}
