package com.example.demo.service;

import com.example.demo.model.response.InventoryResponse;

public interface InventoryService {
    Boolean isInStock(String skuCode);
}
