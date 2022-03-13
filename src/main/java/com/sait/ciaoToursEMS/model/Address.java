package com.sait.ciaoToursEMS.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String address;

    private String city;

    public Address() {
    }

    public Address(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "address=" + address + ", city=" + city + '}';
    }

}


