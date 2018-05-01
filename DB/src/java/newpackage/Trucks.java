/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sg chowdhury
 */
@Entity
@Table(name = "trucks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trucks.findAll", query = "SELECT t FROM Trucks t")
    , @NamedQuery(name = "Trucks.findByTruckId", query = "SELECT t FROM Trucks t WHERE t.truckId = :truckId")
    , @NamedQuery(name = "Trucks.findByModel", query = "SELECT t FROM Trucks t WHERE t.model = :model")
    , @NamedQuery(name = "Trucks.findByMake", query = "SELECT t FROM Trucks t WHERE t.make = :make")
    , @NamedQuery(name = "Trucks.findByYear", query = "SELECT t FROM Trucks t WHERE t.year = :year")
    , @NamedQuery(name = "Trucks.findByCapacity", query = "SELECT t FROM Trucks t WHERE t.capacity = :capacity")})
public class Trucks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TruckId")
    private Integer truckId;
    @Size(max = 20)
    @Column(name = "Model")
    private String model;
    @Size(max = 255)
    @Column(name = "Make")
    private String make;
    @Column(name = "Year")
    private Integer year;
    @Column(name = "Capacity")
    private Integer capacity;
    @OneToMany(mappedBy = "truckID")
    private Collection<Trips> tripsCollection;
    @JoinColumn(name = "UserID", referencedColumnName = "UserID")
    @ManyToOne
    private Users userID;

    public Trucks() {
    }

    public Trucks(Integer truckId) {
        this.truckId = truckId;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @XmlTransient
    public Collection<Trips> getTripsCollection() {
        return tripsCollection;
    }

    public void setTripsCollection(Collection<Trips> tripsCollection) {
        this.tripsCollection = tripsCollection;
    }

    public Users getUserID() {
        return userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (truckId != null ? truckId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trucks)) {
            return false;
        }
        Trucks other = (Trucks) object;
        if ((this.truckId == null && other.truckId != null) || (this.truckId != null && !this.truckId.equals(other.truckId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Trucks[ truckId=" + truckId + " ]";
    }
    
}
