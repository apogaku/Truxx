/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kalva
 */
public class Trips implements Serializable {

    private static final long serialVersionUID = 1L;
     private int tripId;
    
    private String tripStartTime;
  
    private String tripEndTime;
  
    private String tripDate;
    private String tripStartLocationStreetName;
    private String tripBookingTime;
    private String tripDestinationStreetName;
    private int renterUserID;
    private int tripDestinationCityID;
    private int tripDestinationStateID;
    private int tripDestinationZipcodeID;
    private int tripStartLocationCityID;
    private int tripStartLocationStateID;
    private int tripStartLocationZipcodeID;
    private int tripTypeId;
    private int truckID;
    private String Capacity;

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    public Trips() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTripId() {
        return tripId;
    }

    public String getTripStartTime() {
        return tripStartTime;
    }

    public String getTripEndTime() {
        return tripEndTime;
    }

    public String getTripDate() {
        return tripDate;
    }

    public String getTripStartLocationStreetName() {
        return tripStartLocationStreetName;
    }

    public String getTripBookingTime() {
        return tripBookingTime;
    }

    public String getTripDestinationStreetName() {
        return tripDestinationStreetName;
    }

    public int getRenterUserID() {
        return renterUserID;
    }

    public int getTripDestinationCityID() {
        return tripDestinationCityID;
    }

    public int getTripDestinationStateID() {
        return tripDestinationStateID;
    }

    public int getTripDestinationZipcodeID() {
        return tripDestinationZipcodeID;
    }

    public int getTripStartLocationCityID() {
        return tripStartLocationCityID;
    }

    public int getTripStartLocationStateID() {
        return tripStartLocationStateID;
    }

    public int getTripStartLocationZipcodeID() {
        return tripStartLocationZipcodeID;
    }

    public int getTripTypeId() {
        return tripTypeId;
    }

    public int getTruckID() {
        return truckID;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public void setTripStartTime(String tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    public void setTripEndTime(String tripEndTime) {
        this.tripEndTime = tripEndTime;
    }

    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }

    public void setTripStartLocationStreetName(String tripStartLocationStreetName) {
        this.tripStartLocationStreetName = tripStartLocationStreetName;
    }

    public void setTripBookingTime(String tripBookingTime) {
        this.tripBookingTime = tripBookingTime;
    }

    public void setTripDestinationStreetName(String tripDestinationStreetName) {
        this.tripDestinationStreetName = tripDestinationStreetName;
    }

    public void setRenterUserID(int renterUserID) {
        this.renterUserID = renterUserID;
    }

    public void setTripDestinationCityID(int tripDestinationCityID) {
        this.tripDestinationCityID = tripDestinationCityID;
    }

    public void setTripDestinationStateID(int tripDestinationStateID) {
        this.tripDestinationStateID = tripDestinationStateID;
    }

    public void setTripDestinationZipcodeID(int tripDestinationZipcodeID) {
        this.tripDestinationZipcodeID = tripDestinationZipcodeID;
    }

    public void setTripStartLocationCityID(int tripStartLocationCityID) {
        this.tripStartLocationCityID = tripStartLocationCityID;
    }

    public void setTripStartLocationStateID(int tripStartLocationStateID) {
        this.tripStartLocationStateID = tripStartLocationStateID;
    }

    public void setTripStartLocationZipcodeID(int tripStartLocationZipcodeID) {
        this.tripStartLocationZipcodeID = tripStartLocationZipcodeID;
    }

    public void setTripTypeId(int tripTypeId) {
        this.tripTypeId = tripTypeId;
    }

    public void setTruckID(int truckID) {
        this.truckID = truckID;
    }

   


    @Override
    public String toString() {
        return "com.truxx.entities.Trips[ tripId=" + tripId + " ]";
    }
    
}
