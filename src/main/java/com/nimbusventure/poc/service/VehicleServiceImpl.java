package com.nimbusventure.poc.service;

import com.nimbusventure.poc.dto.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kasun on 8/30/17.
 */

public class VehicleServiceImpl implements VehicleService {

    private Map<String, Vehicle> singletonVehicleMap = new HashMap<>();

    @Override public void addVehicle(Vehicle vehicle) {
        singletonVehicleMap.put(vehicle.getVehicleId(), vehicle);
    }

    @Override public void removeVehicle(String vehicleNumber) {
        singletonVehicleMap.remove(vehicleNumber);
    }

    @Override public Vehicle findVehicle(String vehicleNumber) {
        return singletonVehicleMap.get(vehicleNumber);
    }

    @Override public List<Vehicle> retrieveAll() {
        return (List<Vehicle>) singletonVehicleMap.values();
    }
}
