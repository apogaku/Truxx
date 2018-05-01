/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kalva
 */
@Entity
@Table(name = "pricechart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pricechart.findAll", query = "SELECT p FROM Pricechart p")
    , @NamedQuery(name = "Pricechart.findById", query = "SELECT p FROM Pricechart p WHERE p.id = :id")
    , @NamedQuery(name = "Pricechart.findByCapacity", query = "SELECT p FROM Pricechart p WHERE p.capacity = :capacity")
    , @NamedQuery(name = "Pricechart.findByRate", query = "SELECT p FROM Pricechart p WHERE p.rate = :rate")})
public class Pricechart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Capacity")
    private Integer capacity;
    @Size(max = 100)
    @Column(name = "Rate")
    private String rate;
    @JoinColumn(name = "TripTypeID", referencedColumnName = "TripTypeID")
    @ManyToOne
    private Triptype tripTypeID;

    public Pricechart() {
    }

    public Pricechart(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Triptype getTripTypeID() {
        return tripTypeID;
    }

    public void setTripTypeID(Triptype tripTypeID) {
        this.tripTypeID = tripTypeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pricechart)) {
            return false;
        }
        Pricechart other = (Pricechart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.truxx.entities.Pricechart[ id=" + id + " ]";
    }
    
}
