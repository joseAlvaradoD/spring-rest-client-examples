package jjad.springframework.client.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Address implements Serializable {
    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public Geo geo;
}
