package jjjad.springframework.client.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Billing implements Serializable {
    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
