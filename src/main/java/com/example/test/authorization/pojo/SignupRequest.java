package com.example.test.authorization.pojo;

import javax.validation.constraints.NotBlank;
import java.util.Set;

public class SignupRequest {

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private Set<String> roles;

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

    public Set<String> getRoles() {
        return this.roles;
    }

    public void setRole(Set<String> roles) {
        this.roles = roles;
    }
}
