package com.example.demo.controller;

import com.example.demo.constant.RestMappingConstant;
import com.example.demo.model.response.BaseApiResponse;
import com.example.demo.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RestMappingConstant.InventoryConstant.INVENTORY_URL)
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public ResponseEntity<BaseApiResponse<Boolean>> isInStock(@RequestParam("skuCode") String skuCode) {
        return ResponseEntity.ok(new BaseApiResponse<>(inventoryService.isInStock(skuCode)));
    }
}
