package com.nimbusventure.poc.app;

import com.nimbusventure.poc.service.VehicleServiceImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kasun on 8/30/17.
 */
public class VehicleApplication extends Application {

    private Set<Object> singletons = new HashSet<>();

    public VehicleApplication() {
        singletons.add(new VehicleServiceImpl());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
