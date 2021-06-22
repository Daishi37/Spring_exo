package models;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Address implements Serializable {

    private String Address;

    public Address() {
    }

    public Address(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Address='" + Address + '\'' +
                '}';
    }
}