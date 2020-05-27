package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Employer extends AbstractEntity {
    @NotNull
    @ManyToOne
    String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;

    }
}
