package jjad.springframework.client.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Geo implements Serializable {
    public String lat;
    public String lng;
}
