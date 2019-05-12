/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Nichiket
 */
@Entity
public class company {
    @Id
    @GeneratedValue
    int id;
    private String name;
    
    private String email;
    private String website;
    private String number;
    private String skills;
    private String Employees;
    private String ten;
    private String twelve;
    private String BE;

    public company() {
    }

    public company(String name, String email, String website, String number, String skills, String Employees, String ten, String twelve, String BE) {
        this.name = name;
        this.email = email;
        this.website = website;
        this.number = number;
        this.skills = skills;
        this.Employees = Employees;
        this.ten = ten;
        this.twelve = twelve;
        this.BE = BE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getEmployees() {
        return Employees;
    }

    public void setEmployees(String Employees) {
        this.Employees = Employees;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTwelve() {
        return twelve;
    }

    public void setTwelve(String twelve) {
        this.twelve = twelve;
    }

    public String getBE() {
        return BE;
    }

    public void setBE(String BE) {
        this.BE = BE;
    }
    
    
    
}
