package com.example.test.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private UUID guid;
    private String Country;
    private String City;
    private String Street;

    public Address( String country, String city, String street) {
        this.guid = guid;
        Country = country;
        City = city;
        Street = street;
    }

    @OneToMany(targetEntity=House.class, mappedBy="address", fetch= FetchType.EAGER)
    private List<House> house = new ArrayList<>();

   public String getFullAddress() {
       return Country + " " +City + " " +Street;
   }

    public String getShortAddress() {
        return City + " " +Street;
    }
}