package com.example.demo.service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


@Service
public class GetData {

    

    public String getData(){
        
        String fromSpring = "Hello from spring side";

        String fromNode = getDataFromNode();

        System.out.println(fromSpring + " \\n " + fromNode);
        return fromSpring + " <br/> " + fromNode;

    }

    private String getDataFromNode() {
        RestTemplate restTemplate = new RestTemplate();

        String URI  = "http://localhost:8081/node";

        System.out.println(URI);
        
        ResponseEntity<String> response = restTemplate.getForEntity(URI, String.class);
        if (response.getStatusCode() != HttpStatus.OK) 
            throw new HttpClientErrorException(response.getStatusCode());

        return response.getBody();
    }
}
