package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @ManyToOne(optional=false, cascade= CascadeType.ALL)
    @JoinColumn(name="house_id")
    private Address address;
    private String num;

    public House(Address address, String num) {
        this.address = address;
        this.num = num;
    }

    public String getAddress() {
        return address.getFullAddress();
    }
}
