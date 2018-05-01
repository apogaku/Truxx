/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

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
 * @author sg chowdhury
 */
@Entity
@Table(name = "trips")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trips.findAll", query = "SELECT t FROM Trips t")
    , @NamedQuery(name = "Trips.findByTripId", query = "SELECT t FROM Trips t WHERE t.tripId = :tripId")
    , @NamedQuery(name = "Trips.findByTripStartTime", query = "SELECT t FROM Trips t WHERE t.tripStartTime = :tripStartTime")
    , @NamedQuery(name = "Trips.findByTripEndTime", query = "SELECT t FROM Trips t WHERE t.tripEndTime = :tripEndTime")
    , @NamedQuery(name = "Trips.findByTripDate", query = "SELECT t FROM Trips t WHERE t.tripDate = :tripDate")
    , @NamedQuery(name = "Trips.findByTripStartLocationStreetName", query = "SELECT t FROM Trips t WHERE t.tripStartLocationStreetName = :tripStartLocationStreetName")
    , @NamedQuery(name = "Trips.findByTripBookingTime", query = "SELECT t FROM Trips t WHERE t.tripBookingTime = :tripBookingTime")
    , @NamedQuery(name = "Trips.findByTripDestinationStreetName", query = "SELECT t FROM Trips t WHERE t.tripDestinationStreetName = :tripDestinationStreetName")})
public class Trips implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TripId")
    private Integer tripId;
    @Column(name = "TripStartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tripStartTime;
    @Column(name = "TripEndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tripEndTime;
    @Column(name = "TripDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tripDate;
    @Size(max = 255)
    @Column(name = "TripStartLocationStreetName")
    private String tripStartLocationStreetName;
    @Size(max = 255)
    @Column(name = "TripBookingTime")
    private String tripBookingTime;
    @Size(max = 255)
    @Column(name = "TripDestinationStreetName")
    private String tripDestinationStreetName;
    @JoinColumn(name = "RenterUserID", referencedColumnName = "UserID")
    @ManyToOne
    private Users renterUserID;
    @JoinColumn(name = "TripDestinationCityID", referencedColumnName = "CityID")
    @ManyToOne
    private City tripDestinationCityID;
    @JoinColumn(name = "TripDestinationStateID", referencedColumnName = "StateID")
    @ManyToOne
    private State tripDestinationStateID;
    @JoinColumn(name = "TripDestinationZipcodeID", referencedColumnName = "ID")
    @ManyToOne
    private Zipcode tripDestinationZipcodeID;
    @JoinColumn(name = "TripStartLocationCityID", referencedColumnName = "CityID")
    @ManyToOne
    private City tripStartLocationCityID;
    @JoinColumn(name = "TripStartLocationStateID", referencedColumnName = "StateID")
    @ManyToOne
    private State tripStartLocationStateID;
    @JoinColumn(name = "TripStartLocationZipcodeID", referencedColumnName = "ID")
    @ManyToOne
    private Zipcode tripStartLocationZipcodeID;
    @JoinColumn(name = "TripTypeId", referencedColumnName = "TripTypeID")
    @ManyToOne
    private Triptype tripTypeId;
    @JoinColumn(name = "TruckID", referencedColumnName = "TruckId")
    @ManyToOne
    private Trucks truckID;

    public Trips() {
    }

    public Trips(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Date getTripStartTime() {
        return tripStartTime;
    }

    public void setTripStartTime(Date tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    public Date getTripEndTime() {
        return tripEndTime;
    }

    public void setTripEndTime(Date tripEndTime) {
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

    public String getTripBookingTime() {
        return tripBookingTime;
    }

    public void setTripBookingTime(String tripBookingTime) {
        this.tripBookingTime = tripBookingTime;
    }

    public String getTripDestinationStreetName() {
        return tripDestinationStreetName;
    }

    public void setTripDestinationStreetName(String tripDestinationStreetName) {
        this.tripDestinationStreetName = tripDestinationStreetName;
    }

    public Users getRenterUserID() {
        return renterUserID;
    }

    public void setRenterUserID(Users renterUserID) {
        this.renterUserID = renterUserID;
    }

    public City getTripDestinationCityID() {
        return tripDestinationCityID;
    }

    public void setTripDestinationCityID(City tripDestinationCityID) {
        this.tripDestinationCityID = tripDestinationCityID;
    }

    public State getTripDestinationStateID() {
        return tripDestinationStateID;
    }

    public void setTripDestinationStateID(State tripDestinationStateID) {
        this.tripDestinationStateID = tripDestinationStateID;
    }

    public Zipcode getTripDestinationZipcodeID() {
        return tripDestinationZipcodeID;
    }

    public void setTripDestinationZipcodeID(Zipcode tripDestinationZipcodeID) {
        this.tripDestinationZipcodeID = tripDestinationZipcodeID;
    }

    public City getTripStartLocationCityID() {
        return tripStartLocationCityID;
    }

    public void setTripStartLocationCityID(City tripStartLocationCityID) {
        this.tripStartLocationCityID = tripStartLocationCityID;
    }

    public State getTripStartLocationStateID() {
        return tripStartLocationStateID;
    }

    public void setTripStartLocationStateID(State tripStartLocationStateID) {
        this.tripStartLocationStateID = tripStartLocationStateID;
    }

    public Zipcode getTripStartLocationZipcodeID() {
        return tripStartLocationZipcodeID;
    }

    public void setTripStartLocationZipcodeID(Zipcode tripStartLocationZipcodeID) {
        this.tripStartLocationZipcodeID = tripStartLocationZipcodeID;
    }

    public Triptype getTripTypeId() {
        return tripTypeId;
    }

    public void setTripTypeId(Triptype tripTypeId) {
        this.tripTypeId = tripTypeId;
    }

    public Trucks getTruckID() {
        return truckID;
    }

    public void setTruckID(Trucks truckID) {
        this.truckID = truckID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tripId != null ? tripId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trips)) {
            return false;
        }
        Trips other = (Trips) object;
        if ((this.tripId == null && other.tripId != null) || (this.tripId != null && !this.tripId.equals(other.tripId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Trips[ tripId=" + tripId + " ]";
    }
    
}
