/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kalva
 */
@Entity
@Table(name = "triptype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Triptype.findAll", query = "SELECT t FROM Triptype t")
    , @NamedQuery(name = "Triptype.findByTripTypeID", query = "SELECT t FROM Triptype t WHERE t.tripTypeID = :tripTypeID")
    , @NamedQuery(name = "Triptype.findByTripTypeName", query = "SELECT t FROM Triptype t WHERE t.tripTypeName = :tripTypeName")})
public class Triptype implements Serializable {

  

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TripTypeID")
    private Integer tripTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TripTypeName")
    private String tripTypeName;
    @OneToMany(mappedBy = "tripTypeID")
    private Collection<Pricechart> pricechartCollection;

    public Triptype() {
    }

    public Triptype(Integer tripTypeID) {
        this.tripTypeID = tripTypeID;
    }

    public Triptype(Integer tripTypeID, String tripTypeName) {
        this.tripTypeID = tripTypeID;
        this.tripTypeName = tripTypeName;
    }

    public Integer getTripTypeID() {
        return tripTypeID;
    }

    public void setTripTypeID(Integer tripTypeID) {
        this.tripTypeID = tripTypeID;
    }

    public String getTripTypeName() {
        return tripTypeName;
    }

    public void setTripTypeName(String tripTypeName) {
        this.tripTypeName = tripTypeName;
    }

    @XmlTransient
    public Collection<Pricechart> getPricechartCollection() {
        return pricechartCollection;
    }

    public void setPricechartCollection(Collection<Pricechart> pricechartCollection) {
        this.pricechartCollection = pricechartCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tripTypeID != null ? tripTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Triptype)) {
            return false;
        }
        Triptype other = (Triptype) object;
        if ((this.tripTypeID == null && other.tripTypeID != null) || (this.tripTypeID != null && !this.tripTypeID.equals(other.tripTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.truxx.entities.Triptype[ tripTypeID=" + tripTypeID + " ]";
    }


    
}
