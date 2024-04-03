package jjjad.springframework.client.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ExpirationDate implements Serializable {
    private String date;
    private Integer timezoneType;
    private String timezone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
