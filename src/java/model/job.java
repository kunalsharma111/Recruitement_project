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
public class job {
    @Id
    @GeneratedValue
    private int Job_id;
    private String Job_type;
    private String Job_duration;
    private String Job_name;
    private String Job_location;

    public job() {
    }

    public job(String Job_type, String Job_duration, String Job_name, String Job_location) {
        this.Job_type = Job_type;
        this.Job_duration = Job_duration;
        this.Job_name = Job_name;
        this.Job_location = Job_location;
    }
    

    public String getJob_location() {
        return Job_location;
    }

    public void setJob_location(String Job_location) {
        this.Job_location = Job_location;
    }



    public String getJob_type() {
        return Job_type;
    }

    public void setJob_type(String Job_type) {
        this.Job_type = Job_type;
    }

    public String getJob_duration() {
        return Job_duration;
    }

    public void setJob_duration(String Job_duration) {
        this.Job_duration = Job_duration;
    }

    public String getJob_name() {
        return Job_name;
    }

    public void setJob_name(String Job_name) {
        this.Job_name = Job_name;
    }

    public int getJob_id() {
        return Job_id;
    }
    
    
}
