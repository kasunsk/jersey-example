package com.nimbusventure.poc.service;

import com.nimbusventure.poc.dto.Vehicle;

import java.util.List;

/**
 * Created by kasun on 8/30/17.
 */
public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    void removeVehicle(String vehicleNumber);

    Vehicle findVehicle(String vehicleNumber);

    List<Vehicle> retrieveAll();

}
