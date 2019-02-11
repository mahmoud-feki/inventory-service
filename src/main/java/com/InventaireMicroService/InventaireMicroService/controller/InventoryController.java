/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InventaireMicroService.InventaireMicroService.controller;

import com.InventaireMicroService.InventaireMicroService.entity.InventoryItem;
import com.InventaireMicroService.InventaireMicroService.repository.InventaireRepository;
import static java.lang.Math.log;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mafeki
 */
@RestController
public class InventoryController {

    @Autowired
    private InventaireRepository inventaireRepository;

    @GetMapping("/api/inventory/{productCode}")
    public ResponseEntity<InventoryItem> findInventoryByProductCode(@PathVariable("productCode") String productCode) {
        System.out.println("Finding inventory for product code :" + productCode);
        Optional<InventoryItem> inventoryItem = inventaireRepository.findByCode(productCode);
        if (inventoryItem.isPresent()) {
            return new ResponseEntity(inventoryItem, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

}
