package com.example.test.authorization.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "users",
        uniqueConstraints =  @UniqueConstraint(columnNames = "email"))

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String email;
    private String password;

    private String firstName;
    private String familyName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_roles",
                joinColumns = @JoinColumn(name="user_id"),
                inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles = new HashSet<>();

    public User() { }

    public User(String email, String password, String firstName, String familyName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
