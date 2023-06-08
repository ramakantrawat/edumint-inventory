package com.example.demo.service.impl;

import com.example.demo.repository.InventoryRepository;
import com.example.demo.service.InventoryService;
import com.example.demo.service.TestClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

import javax.inject.Singleton;
import java.net.URI;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private TestClass testClass;
    @Override
    @Transactional(readOnly = true)
    public Boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }

    public void getDataFRT(){

        String body = "{\"name\":\"John\",\"age\":25}";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        RequestEntity<String> entity = new RequestEntity(body,httpHeaders,HttpMethod.GET, URI.create(""));
        restTemplate.exchange(entity,Student.class);
    }
}
class Student {

}
