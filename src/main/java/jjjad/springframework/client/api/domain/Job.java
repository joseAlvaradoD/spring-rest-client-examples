package jjjad.springframework.client.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Job implements Serializable {
    private String title;
    private String company;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
