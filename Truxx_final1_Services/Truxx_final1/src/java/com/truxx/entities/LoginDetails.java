/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

public class LoginDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer userID;
    private String Username;
    private String Password;
    public LoginDetails() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

     
    
}
