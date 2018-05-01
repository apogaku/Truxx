/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.entities.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author kalva
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
       resources.add(com.truxx.entities.service.CityFacadeREST.class);
     resources.add(com.truxx.entities.service.DriverFacadeREST.class);
       resources.add(com.truxx.entities.service.LoginService.class);
      resources.add(com.truxx.entities.service.PricechartFacadeREST.class);
     resources.add(com.truxx.entities.service.RenterFacadeREST.class);
     resources.add(com.truxx.entities.service.StateFacadeREST.class);
    resources.add(com.truxx.entities.service.TriptypeFacadeREST.class);
    resources.add(com.truxx.entities.service.TrucksFacadeREST.class);
        resources.add(com.truxx.entities.service.TypeFacadeREST.class);
        resources.add(com.truxx.entities.service.UsersFacadeREST.class);
    }
    
}
