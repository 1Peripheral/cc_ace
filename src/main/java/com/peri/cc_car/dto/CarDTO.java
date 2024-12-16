package com.peri.cc_car.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@Builder
public class CarDTO {
    private String model;
    private String color;
    private String matircule;
    private Double price;
}
