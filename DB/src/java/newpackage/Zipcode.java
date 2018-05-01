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
 * @author sg chowdhury
 */
@Entity
@Table(name = "zipcode")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zipcode.findAll", query = "SELECT z FROM Zipcode z")
    , @NamedQuery(name = "Zipcode.findById", query = "SELECT z FROM Zipcode z WHERE z.id = :id")
    , @NamedQuery(name = "Zipcode.findByZipcode", query = "SELECT z FROM Zipcode z WHERE z.zipcode = :zipcode")})
public class Zipcode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 10)
    @Column(name = "Zipcode")
    private String zipcode;
    @OneToMany(mappedBy = "tripDestinationZipcodeID")
    private Collection<Trips> tripsCollection;
    @OneToMany(mappedBy = "tripStartLocationZipcodeID")
    private Collection<Trips> tripsCollection1;
    @OneToMany(mappedBy = "zipcodeID")
    private Collection<Users> usersCollection;

    public Zipcode() {
    }

    public Zipcode(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @XmlTransient
    public Collection<Trips> getTripsCollection() {
        return tripsCollection;
    }

    public void setTripsCollection(Collection<Trips> tripsCollection) {
        this.tripsCollection = tripsCollection;
    }

    @XmlTransient
    public Collection<Trips> getTripsCollection1() {
        return tripsCollection1;
    }

    public void setTripsCollection1(Collection<Trips> tripsCollection1) {
        this.tripsCollection1 = tripsCollection1;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
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
        if (!(object instanceof Zipcode)) {
            return false;
        }
        Zipcode other = (Zipcode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Zipcode[ id=" + id + " ]";
    }
    
}
