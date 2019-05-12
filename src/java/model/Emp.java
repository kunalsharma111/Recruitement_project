
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
    @Id
private String your_email;
private String first_name;
private String last_name;
private String password;

    public String getFirst_name() {
        return first_name;
    }

    public Emp(String first_name, String last_name, String your_email, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.your_email = your_email;
        this.password = password;
    }

    public Emp() {
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getYour_email() {
        return your_email;
    }

    public void setYour_email(String your_email) {
        this.your_email = your_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        public boolean equals(Object o){
        Emp u=(Emp) o;
        if((this.first_name.equals(u.getFirst_name())) && (this.password.equals(u.getPassword()))){
            return true;
        }
        else{
            return false;
        }
    }
}
