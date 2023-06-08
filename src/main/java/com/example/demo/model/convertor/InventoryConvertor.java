package com.example.demo.model.convertor;

import com.example.demo.model.entity.InventoryEntity;
import com.example.demo.model.request.InventoryRequest;
import com.example.demo.model.response.InventoryResponse;


public class InventoryConvertor {
    public static InventoryResponse entityToResponse(InventoryEntity inventoryEntity) {
        return InventoryResponse.builder().
                id(inventoryEntity.getId()).
                skuCode(inventoryEntity.getSkuCode()).
                quantity(inventoryEntity.getQuantity()).
                build();
    }

    public static InventoryEntity requestToEntity(InventoryRequest inventoryRequest) {
        return InventoryEntity.builder().
                skuCode(inventoryRequest.getSkuCode()).
                quantity(inventoryRequest.getQuantity()).
                build();
    }

}
