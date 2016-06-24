package main.groovy.test

/**
 * Created by klevshin on 6/24/2016.
 */

import org.springframework.web.client.RestTemplate

class ClientFactoryRest {
    public OperatingStructure getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        OperatingStructure operatingStructure = restTemplate.getForObject("http://localhost:8080/operating?operation=summing&value1=50&value2=100", OperatingStructure.class);

        return operatingStructure;
    }
}
