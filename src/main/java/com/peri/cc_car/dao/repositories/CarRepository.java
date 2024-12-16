package com.peri.cc_car.dao.repositories;

import com.peri.cc_car.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    public List<Car> findCarsByModel(String model);
}
