package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{


//    @ManyToOne
    private String employer;

//    @ManyToMany
    private String skills;

    public Job() {
    }

    public Job(String employer, String skills) {
        super();
        this.employer= employer;
        this.skills = skills;
    }

    // Getters and setters.

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
