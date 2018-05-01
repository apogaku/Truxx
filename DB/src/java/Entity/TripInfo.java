/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author sg chowdhury
 */
public class TripInfo {
    private Timestamp tripStartTime;
    private Timestamp tripEndTime;
    private Date tripDate;
    private String tripStartLocationStreetName;
    
    private String tripDestinationStreetName;

    public Timestamp getTripStartTime() {
        return tripStartTime;
    }

    public void setTripStartTime(Timestamp tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    public Timestamp getTripEndTime() {
        return tripEndTime;
    }

    public void setTripEndTime(Timestamp tripEndTime) {
        this.tripEndTime = tripEndTime;
    }

   

    public Date getTripDate() {
        return tripDate;
    }

    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }

    public String getTripStartLocationStreetName() {
        return tripStartLocationStreetName;
    }

    public void setTripStartLocationStreetName(String tripStartLocationStreetName) {
        this.tripStartLocationStreetName = tripStartLocationStreetName;
    }

  

    public String getTripDestinationStreetName() {
        return tripDestinationStreetName;
    }

    public void setTripDestinationStreetName(String tripDestinationStreetName) {
        this.tripDestinationStreetName = tripDestinationStreetName;
    }
    
}
