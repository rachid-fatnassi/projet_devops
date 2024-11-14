package tn.esprit.devops_project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// Optional, can be removed if not needed
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

