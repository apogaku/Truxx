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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Entity
@Table(name = "driver")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d")
    , @NamedQuery(name = "Driver.findById", query = "SELECT d FROM Driver d WHERE d.id = :id")
    , @NamedQuery(name = "Driver.findBySsn", query = "SELECT d FROM Driver d WHERE d.ssn = :ssn")
    , @NamedQuery(name = "Driver.findByLicenseNumber", query = "SELECT d FROM Driver d WHERE d.licenseNumber = :licenseNumber")
    , @NamedQuery(name = "Driver.findByLicenseExpiryDate", query = "SELECT d FROM Driver d WHERE d.licenseExpiryDate = :licenseExpiryDate")})
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "SSN")
    private String ssn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "LicenseNumber")
    private String licenseNumber;
    @Column(name = "LicenseExpiryDate")
    @Temporal(TemporalType.DATE)
    private Date licenseExpiryDate;
    @JoinColumn(name = "UserId", referencedColumnName = "UserID")
    @ManyToOne(optional = false)
    private Users userId;

    public Driver() {
    }

    public Driver(Integer id) {
        this.id = id;
    }

    public Driver(Integer id, String ssn, String licenseNumber) {
        this.id = id;
        this.ssn = ssn;
        this.licenseNumber = licenseNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(Date licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
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
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.truxx.entities.Driver[ id=" + id + " ]";
    }
    
}
