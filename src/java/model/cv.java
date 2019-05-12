/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Nichiket
 */
@Entity
public class cv {
    @Id
    private String email;
    private String from;
    private String phone;
    private String name;
    private String Key_skills;
    private String PE;
    private String tweleveth;
    private String tenth;
    private String BE;
    private String dob;
    private String Gender;

    public cv() {
    }

    public cv(String email, String from, String phone, String name, String Key_skills, String PE, String tweleveth, String tenth, String BE, String dob, String Gender) {
        this.email = email;
        this.from = from;
        this.phone = phone;
        this.name = name;
        this.Key_skills = Key_skills;
        this.PE = PE;
        this.tweleveth = tweleveth;
        this.tenth = tenth;
        this.BE = BE;
        this.dob = dob;
        this.Gender = Gender;
    }

        
        
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey_skills() {
        return Key_skills;
    }

    public void setKey_skills(String Key_skills) {
        this.Key_skills = Key_skills;
    }

    public String getPE() {
        return PE;
    }

    public void setPE(String PE) {
        this.PE = PE;
    }

    public String getTweleveth() {
        return tweleveth;
    }

    public void setTweleveth(String tweleveth) {
        this.tweleveth = tweleveth;
    }

    public String getTenth() {
        return tenth;
    }

    public void setTenth(String tenth) {
        this.tenth = tenth;
    }

    public String getBE() {
        return BE;
    }

    public void setBE(String BE) {
        this.BE = BE;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    
    
    
}
