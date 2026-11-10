package com.cesur.valentin.ejercicioinventarioapp.models;

import lombok.Data;

@Data
public class Device {
    private Long id;
    private String name;
    private String category;
    private Boolean availability;
}