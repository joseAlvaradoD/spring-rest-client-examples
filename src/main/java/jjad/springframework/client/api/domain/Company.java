package jjad.springframework.client.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Company implements Serializable {
    public String name;
    public String catchPhrase;
    public String bs;
}
